package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by madhurtewani on 4/4/19.
 */
public class ActivityHeart {

    @SerializedName("dateTime")
    @Expose
    private String dateTime;
    @SerializedName("value")
    @Expose
    private ActivityHeartValue value;

    /**
     * @return The dateTime
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime The dateTime
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * @return The value
     */
    public ActivityHeartValue getValue() {
        return value;
    }

    /**
     * @param value The value
     */
    public void setValue(ActivityHeartValue value) {
        this.value = value;
    }

}
