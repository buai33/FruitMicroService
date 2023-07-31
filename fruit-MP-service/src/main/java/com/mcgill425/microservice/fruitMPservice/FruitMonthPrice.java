package com.mcgill425.microservice.fruitMPservice;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

import java.util.HashMap;


@Entity
public class FruitMonthPrice implements Serializable {
    @Id
    private Long id;
    private String fruit;


    private String environment;

    private Double fmp;





   public static HashMap<String, Double> map;


    public HashMap<String, Double> getMap() {
        return map;
    }

    public void setMap(String s, Double v) {
       map.put(s, v);
    }

    public FruitMonthPrice() {
    }

    public FruitMonthPrice(Long id, String fruit) {
        this.id = id;
        this.fruit = fruit;

    }



    public Long getId() {
        return id;
    }

    public String getFruit() {
        return fruit;
    }



    public Double getFmp() {
        return fmp;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }



    public void setFmp(double fmp) {
        this.fmp = fmp;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getEnvironment() {
        return environment;
    }

}
