package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by madhurtewani on 5/4/19.
 */
public class SleepLevelSummaryItem {
    @SerializedName("count")
    @Expose
    private Long count;
    @SerializedName("minutes")
    @Expose
    private Long minutes;
    @SerializedName("thirtyDayAvgMinutes")
    @Expose
    private Long thirtyDayAvgMinutes;

    /**
     * @return The count
     */
    public Long getCount() {
        return count;
    }

    /**
     * @param count The count
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * @return The minutes
     */
    public Long getMinutes() {
        return minutes;
    }

    /**
     * @param minutes The minutes
     */
    public void setMinutes(Long minutes) {
        this.minutes = minutes;
    }

    /**
     * @return The thirtyDayAvgMinutes
     */
    public Long getThirtyDayAvgMinutes() {
        return thirtyDayAvgMinutes;
    }

    /**
     * @param thirtyDayAvgMinutes The thirtyDayAvgMinutes
     */
    public void setThirtyDayAvgMinutes(Long thirtyDayAvgMinutes) {
        this.thirtyDayAvgMinutes = thirtyDayAvgMinutes;
    }
}
