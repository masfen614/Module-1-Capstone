package com.techelevator.models;

import java.math.BigDecimal;

public class Candy extends Items{
    public Candy(int quantity, String slot, String name, BigDecimal price, String type) {
        super(quantity, slot, name, price, type);
    }
}
