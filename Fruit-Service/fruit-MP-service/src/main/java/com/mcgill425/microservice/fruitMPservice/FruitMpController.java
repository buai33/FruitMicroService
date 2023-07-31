package com.mcgill425.microservice.fruitMPservice;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

import static java.lang.Double.parseDouble;
import static java.lang.Long.parseLong;


@RestController
public class FruitMpController{
    @Autowired
    private Environment environment;

//    @Autowired
//    private FruitMonthPriceRepository repository;
   public FruitMonthPriceRepository repository = new FruitMonthPriceRepository();




//    @GetMapping("/fruit-month-price/fruit/{fruit}/month/{month}")
//    public FruitMonthPrice retrieveMonthPrice (@PathVariable String fruit, @PathVariable String month) {
//
//        FruitMonthPrice fruitMonthPrice = null;
////
//        switch (month) {
//            case "jan":
//                fruitMonthPrice = repository.findByFruitAndMonth(fruit, "jan");
//        }
//        if (fruitMonthPrice == null) {
//            throw new RuntimeException("Unable to find data for " + fruit + " in " + month);
//        }
//
//        String port = environment.getProperty("local.server.port");
//        fruitMonthPrice.setEnvironment(port);
//        return fruitMonthPrice;
//    }

    @RequestMapping("/fruit-month-price/fruit/{fruit}/month/{month}")
    public FruitMonthPrice retrieveMonthPrice (@PathVariable String fruit, @PathVariable String month) throws IOException {
        repository.loadDB();
        FruitMonthPrice fruitMonthPrice = repository.findByFruitAndMonth(fruit, month);
        if (fruitMonthPrice == null) {
            throw new RuntimeException("Unable to find data for " + fruit + " in " + month);
        }

        String port = environment.getProperty("local.server.port");
        fruitMonthPrice.setEnvironment(port);
        return fruitMonthPrice;
    }
}
