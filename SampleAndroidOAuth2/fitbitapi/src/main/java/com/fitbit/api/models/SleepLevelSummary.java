package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by madhurtewani on 5/4/19.
 */
public class SleepLevelSummary {

    @SerializedName("deep")
    @Expose
    private SleepLevelSummaryItem deep;
    @SerializedName("light")
    @Expose
    private SleepLevelSummaryItem light;
    @SerializedName("rem")
    @Expose
    private SleepLevelSummaryItem rem;
    @SerializedName("wake")
    @Expose
    private SleepLevelSummaryItem wake;

    /**
     * @return The deep sleep summary
     */
    public SleepLevelSummaryItem getDeep() {
        return deep;
    }

    /**
     * @param deep The deep sleep summary
     */
    public void setDeep(SleepLevelSummaryItem deep) {
        this.deep = deep;
    }

    /**
     * @return The light sleep summary
     */
    public SleepLevelSummaryItem getLight() {
        return light;
    }

    /**
     * @param light The light sleep summary
     */
    public void setLight(SleepLevelSummaryItem light) {
        this.light = light;
    }

    /**
     * @return The rem sleep summary
     */
    public SleepLevelSummaryItem getRem() {
        return rem;
    }

    /**
     * @param rem The rem sleep summary
     */
    public void setRem(SleepLevelSummaryItem rem) {
        this.rem = rem;
    }

    /**
     * @return The wake summary
     */
    public SleepLevelSummaryItem getWake() {
        return wake;
    }

    /**
     * @param wake The wake summary
     */
    public void setWake(SleepLevelSummaryItem wake) {
        this.wake = wake;
    }
}
