package com.example.entity;

import java.io.Serializable;

public class huanglin implements Serializable {

    public String getName() {
        return name;
    }

    public String getPropertychange() {
        return propertychange;
    }

    public void setPropertychange(String propertychange) {
        this.propertychange = propertychange;
    }


    @Override
    public String toString() {
        return "huanglin{" +
                "propertychange='" + propertychange + '\'' +
                ", name='" + name + '\'' +
                ", rarity='" + rarity + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getRarity() {
        return rarity;
    }


    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    private String name;
    private String rarity;

    private String propertychange;
}
