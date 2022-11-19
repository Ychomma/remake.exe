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
public class Lifeevent implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String content;

    private String achievementIdList;

    private String propertyChange;

    private String imgUrl;

    private String eventType;

    private Integer stageId;

    private String noHappenList;

    private String happenList;

    private String gameover;

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

    public String getAchievementIdList() {
        return achievementIdList;
    }

    public void setAchievementIdList(String achievementIdList) {
        this.achievementIdList = achievementIdList;
    }

    public String getPropertyChange() {
        return propertyChange;
    }

    public void setPropertyChange(String propertyChange) {
        this.propertyChange = propertyChange;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Integer getStageId() {
        return stageId;
    }

    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public String getNoHappenList() {
        return noHappenList;
    }

    public void setNoHappenList(String noHappenList) {
        this.noHappenList = noHappenList;
    }

    public String getHappenList() {
        return happenList;
    }

    public void setHappenList(String happenList) {
        this.happenList = happenList;
    }

    public String getGameover() {
        return gameover;
    }

    public void setGameover(String gameover) {
        this.gameover = gameover;
    }

    @Override
    public String toString() {
        return "Lifeevent{" +
                "id=" + id +
                ", content=" + content +
                ", achievementIdList=" + achievementIdList +
                ", propertyChange=" + propertyChange +
                ", imgUrl=" + imgUrl +
                ", eventType=" + eventType +
                ", stageId=" + stageId +
                ", noHappenList=" + noHappenList +
                ", happenList=" + happenList +
                ", gameover=" + gameover +
                "}";
    }
}
