package com.mcgill425.microservice.fruitMPservice;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

import static java.lang.Double.parseDouble;
import static java.lang.Long.parseLong;

public class FruitMonthPriceRepository {
//    FruitMonthPrice findByFruitAndMonth(String fruit, String month) ;

    public FruitMonthPriceRepository() {
        map = new ConcurrentHashMap<>();
    }

    FruitMonthPrice findByFruitAndMonth(String fruit, String month) {
        FruitMonthPrice result = map.get(fruit);
        Double fmp = result.getMap().get(month);
        result.setFmp(fmp);
        return null;
    }

    ServletContext scontext;
    public ConcurrentHashMap<String, FruitMonthPrice> map;
    private String dbfile;

    public void loadDB() throws IOException {
        if (map.isEmpty()) {
//            System.out.println(":::::::");
//            System.out.println("Working Directory = " + System.getProperty("user.dir"));

//            dbfile = scontext.getRealPath("/Users/xwliu/IdeaProjects/Web_Service/fruit-MP-service/src/main/resources/data.csv");
            dbfile = "./src/main/resources/data.csv";
//            FileReader fr = new FileReader("data.csv");
            BufferedReader r = new BufferedReader(new FileReader(dbfile));
            String currentLine = r.readLine();
            while (currentLine != null) {
                String[] fields = currentLine.split(",");
                FruitMonthPrice mp = new FruitMonthPrice();
                mp.setId(parseLong(fields[0]));
                mp.setFruit(fields[1]);
                mp.setMap("Jan", parseDouble(fields[2]));
                mp.setMap("Feb", parseDouble(fields[3]));
                mp.setMap("Mar", parseDouble(fields[4]));
                mp.setMap("Apr", parseDouble(fields[5]));
                mp.setMap("May", parseDouble(fields[6]));
                mp.setMap("Jun", parseDouble(fields[7]));
                mp.setMap("Jul", parseDouble(fields[8]));
                mp.setMap("Aug", parseDouble(fields[9]));
                mp.setMap("Sep", parseDouble(fields[10]));
                mp.setMap("Oct", parseDouble(fields[11]));
                mp.setMap("Nov", parseDouble(fields[12]));
                mp.setMap("Dec", parseDouble(fields[13]));
                map.put(mp.getFruit(), mp);
            }


        }


    }
}
