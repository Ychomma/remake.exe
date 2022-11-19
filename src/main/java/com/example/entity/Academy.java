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
public class Academy implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String academyName;

    private String academyType;

    private String eventId;

    private String majorList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAcademyName() {
        return academyName;
    }

    public void setAcademyName(String academyName) {
        this.academyName = academyName;
    }

    public String getAcademyType() {
        return academyType;
    }

    public void setAcademyType(String academyType) {
        this.academyType = academyType;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getMajorList() {
        return majorList;
    }

    public void setMajorList(String majorList) {
        this.majorList = majorList;
    }

    @Override
    public String toString() {
        return "Academy{" +
                "id=" + id +
                ", academyName=" + academyName +
                ", academyType=" + academyType +
                ", eventId=" + eventId +
                ", majorList=" + majorList +
                "}";
    }
}
