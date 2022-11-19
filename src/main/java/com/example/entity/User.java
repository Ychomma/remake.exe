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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String achievementDone;

    private Integer cnt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAchievementDone() {
        return achievementDone;
    }

    public void setAchievementDone(String achievementDone) {
        this.achievementDone = achievementDone;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", achievementDone=" + achievementDone +
                ", cnt=" + cnt +
                "}";
    }
}
