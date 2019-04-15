package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by madhurtewani on 5/4/19.
 */
public class SleepSummary {

    @SerializedName("totalMinutesAsleep")
    @Expose
    private Long totalMinutesAsleep;
    @SerializedName("totalSleepRecords")
    @Expose
    private Integer totalSleepRecords;
    @SerializedName("totalTimeInBed")
    @Expose
    private Long totalTimeInBed;

}
