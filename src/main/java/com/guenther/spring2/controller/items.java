package com.guenther.spring2.controller;

/**
 * Created by Grand Circus Student on 8/15/2017.
 */
public class items {
    private String name;
    private String description;
    private String quantity;
    private float price;


    public items(String name, String description, String quantity, float price){
       this.name = name;
       this.description = description;
       this.quantity = quantity;
       this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
