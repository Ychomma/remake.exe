package com.example.entity;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author zck
 * @since 2022-11-19
 */
public class Achievement implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String eventNeed;

    private String propertyNeed;

    private String name;

    private String rarity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventNeed() {
        return eventNeed;
    }

    public void setEventNeed(String eventNeed) {
        this.eventNeed = eventNeed;
    }

    public String getPropertyNeed() {
        return propertyNeed;
    }

    public void setPropertyNeed(String propertyNeed) {
        this.propertyNeed = propertyNeed;
    }

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Achievement{" +
                "id=" + id +
                ", eventNeed=" + eventNeed +
                ", propertyNeed=" + propertyNeed +
                ", name=" + name +
                ", rarity=" + rarity +
                "}";
    }
}
