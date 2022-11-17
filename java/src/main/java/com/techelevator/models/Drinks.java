package com.techelevator.models;

import java.math.BigDecimal;

public class Drinks extends Items{
    public Drinks(int quantity, String slot, String name, BigDecimal price, String type) {
        super(quantity, slot, name, price, type);
    }
}
