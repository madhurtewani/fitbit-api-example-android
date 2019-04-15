package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by madhurtewani on 4/4/19.
 */
public class ActivityHeartValue {

    @SerializedName("heartRateZones")
    @Expose
    private List<HeartRateZone> heartRateZones = new ArrayList<>();
    @SerializedName("customHeartRateZones")
    @Expose
    private List<CustomHeartRateZone> customHeartRateZones = new ArrayList<>();
    @SerializedName("restingHeartRate")
    @Expose
    private int restingHeartRate;

    /**
     * @return The heartRateZones
     */
    public List<HeartRateZone> getHeartRateZones() {
        return heartRateZones;
    }

    /**
     * @param heartRateZones The heartRateZones
     */
    public void setHeartRateZones(List<HeartRateZone> heartRateZones) {
        this.heartRateZones = heartRateZones;
    }

    /**
     * @return The customHeartRateZones
     */
    public List<CustomHeartRateZone> getCustomHeartRateZones() {
        return customHeartRateZones;
    }

    /**
     * @param customHeartRateZones The customHeartRateZones
     */
    public void setCustomHeartRateZones(List<CustomHeartRateZone> customHeartRateZones) {
        this.customHeartRateZones = customHeartRateZones;
    }

    /**
     * @return The restingHeartRate
     */
    public int getRestingHeartRate() {
        return restingHeartRate;
    }

    /**
     * @param restingHeartRate The restingHeartRate
     */
    public void setRestingHeartRate(int restingHeartRate) {
        this.restingHeartRate = restingHeartRate;
    }
}
