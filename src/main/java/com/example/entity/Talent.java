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
public class Talent implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String rarity;

    private String propertyChange;

    private String talentEventId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPropertyChange() {
        return propertyChange;
    }

    public void setPropertyChange(String propertyChange) {
        this.propertyChange = propertyChange;
    }

    public String getTalentEventId() {
        return talentEventId;
    }

    public void setTalentEventId(String talentEventId) {
        this.talentEventId = talentEventId;
    }

    @Override
    public String toString() {
        return "Talent{" +
                "id=" + id +
                ", name=" + name +
                ", rarity=" + rarity +
                ", propertyChange=" + propertyChange +
                ", talentEventId=" + talentEventId +
                "}";
    }
}
