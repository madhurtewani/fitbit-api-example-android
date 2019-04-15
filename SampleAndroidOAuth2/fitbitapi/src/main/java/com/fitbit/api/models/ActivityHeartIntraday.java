package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by madhurtewani on 4/4/19.
 */
public class ActivityHeartIntraday {

    @SerializedName("dataset")
    @Expose
    private List<HeartRateDataSet> dataset = new ArrayList<>();
    @SerializedName("datasetInterval")
    @Expose
    private int datasetInterval;
    @SerializedName("datasetType")
    @Expose
    private String datasetType;

    /**
     * @return The dataset
     */
    public List<HeartRateDataSet> getDataset() {
        return dataset;
    }

    /**
     * @param dataset The dataset
     */
    public void setDataset(List<HeartRateDataSet> dataset) {
        this.dataset = dataset;
    }

    /**
     * @return The datasetInterval
     */
    public int getDatasetInterval() {
        return datasetInterval;
    }

    /**
     * @param datasetInterval The datasetInterval
     */
    public void setDatasetInterval(int datasetInterval) {
        this.datasetInterval = datasetInterval;
    }

    /**
     * @return The datasetType
     */
    public String getDatasetType() {
        return datasetType;
    }

    /**
     * @param datasetType The datasetType
     */
    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }
}
