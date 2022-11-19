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
public class Vacation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String content;

    private String propertyChange;

    private Integer vacationId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPropertyChange() {
        return propertyChange;
    }

    public void setPropertyChange(String propertyChange) {
        this.propertyChange = propertyChange;
    }

    public Integer getVacationId() {
        return vacationId;
    }

    public void setVacationId(Integer vacationId) {
        this.vacationId = vacationId;
    }

    @Override
    public String toString() {
        return "Vacation{" +
                "id=" + id +
                ", content=" + content +
                ", propertyChange=" + propertyChange +
                ", vacationId=" + vacationId +
                "}";
    }
}
