package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by madhurtewani on 4/4/19.
 */
public class HeartRateLogs {

    @SerializedName("activities-heart")
    @Expose
    private List<ActivityHeart> activitiesHeart = new ArrayList<>();
    @SerializedName("activities-heart-intraday")
    @Expose
    private List<ActivityHeartIntraday> activitiesHeartIntraday = new ArrayList<>();

    /**
     * @return The activitiesHeart
     */
    public List<ActivityHeart> getActivitiesHeart() {
        return activitiesHeart;
    }

    /**
     * @param activitiesHeart The activitiesHeart
     */
    public void setActivitiesHeart(List<ActivityHeart> activitiesHeart) {
        this.activitiesHeart = activitiesHeart;
    }

    /**
     * @return The activitiesHeartIntraday
     */
    public List<ActivityHeartIntraday> getActivitiesHeartIntraday() {
        return activitiesHeartIntraday;
    }

    /**
     * @param activitiesHeartIntraday The activitiesHeartIntraday
     */
    public void setActivitiesHeartIntraday(List<ActivityHeartIntraday> activitiesHeartIntraday) {
        this.activitiesHeartIntraday = activitiesHeartIntraday;
    }

}
