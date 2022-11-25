package com.example.entity;

import java.io.Serializable;

public class huanglin2 implements Serializable {
    private String propertychange;

    public String getpropertychange() {
        return propertychange;
    }

    public void setpropertychange(String propertychange) {
        this.propertychange = propertychange;
    }

    @Override
    public String toString() {
        return "huanglin2{" +
                "propertychange='" + propertychange + '\'' +
                '}';
    }
}
