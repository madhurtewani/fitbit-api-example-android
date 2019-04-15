package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SleepLevelData {

    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("seconds")
    @Expose
    private Long seconds;

    /**
     * @return The datetime
     */
    public String getDatetime() {
        return datetime;
    }

    /**
     * @param datetime The datetime
     */
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level The level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * @return The seconds
     */
    public Long getSeconds() {
        return seconds;
    }

    /**
     * @param seconds The seconds
     */
    public void setSeconds(Long seconds) {
        this.seconds = seconds;
    }
}
