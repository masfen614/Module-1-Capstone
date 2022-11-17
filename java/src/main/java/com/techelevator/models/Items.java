package com.techelevator.models;

import java.io.File;
import java.math.BigDecimal;
import java.util.Scanner;

public abstract class Items {
    private String slot;
    private String name;
    BigDecimal price;
    String type;
    private int quantity;

    public Items(int quantity, String slot, String name, BigDecimal price, String type){

        this.slot = slot;
        this.name = name;
        this.price = price;
        this.type = type;
        this.quantity = quantity;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return quantity + "" + " " + name + " " + price + " " + type;
    }
}
