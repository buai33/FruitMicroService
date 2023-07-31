package com.mcgill425.microservice.fruitTPservice.fruitTPservice;

public class FruitTotalPrice {
    private Long id;
    private String fruit;
    private String month;
    private Double fmp;
    private Double quantity;
    private Double totalPrice;
    private String environment;

    public FruitTotalPrice() {
    }

    public FruitTotalPrice(Long id, String fruit, String month, Double fmp, Double quantity, Double totalPrice, String environment) {
        this.id = id;
        this.fruit = fruit;
        this.month = month;
        this.fmp = fmp;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.environment = environment;
    }

    public Long getId() {
        return id;
    }

    public String getFruit() {
        return fruit;
    }

    public String getMonth() {
        return month;
    }

    public Double getFmp() {
        return fmp;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setFmp(Double fmp) {
        this.fmp = fmp;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
