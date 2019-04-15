package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by madhurtewani on 5/4/19.
 */
public class SleepLevel {

    @SerializedName("summary")
    @Expose
    private SleepLevelSummary summary;
    @SerializedName("data")
    @Expose
    private List<SleepLevelData> data;
    @SerializedName("shortData")
    @Expose
    private List<SleepLevelData> shortData;

    /**
     * @return The summary
     */
    public SleepLevelSummary getSummary() {
        return summary;
    }

    /**
     * @param summary The summary
     */
    public void setSummary(SleepLevelSummary summary) {
        this.summary = summary;
    }

    /**
     * @return The data
     */
    public List<SleepLevelData> getData() {
        return data;
    }

    /**
     * @param data The data
     */
    public void setData(List<SleepLevelData> data) {
        this.data = data;
    }

    /**
     * @return The shortData
     */
    public List<SleepLevelData> getShortData() {
        return shortData;
    }

    /**
     * @param shortData The shortData
     */
    public void setShortData(List<SleepLevelData> shortData) {
        this.shortData = shortData;
    }
}
