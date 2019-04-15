package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by madhurtewani on 5/4/19.
 */
public class Sleep {

    @SerializedName("dateOfSleep")
    @Expose
    private String dateOfSleep;
    @SerializedName("duration")
    @Expose
    private Long duration;
    @SerializedName("efficiency")
    @Expose
    private Double efficiency;
    @SerializedName("isMainSleep")
    @Expose
    private Boolean isMainSleep;
    @SerializedName("levels")
    @Expose
    private SleepLevel levels;
    @SerializedName("logId")
    @Expose
    private String logId;
    @SerializedName("minutesAfterWakeup")
    @Expose
    private Long minutesAfterWakeup;
    @SerializedName("minutesAsleep")
    @Expose
    private Long minutesAsleep;
    @SerializedName("minutesAwake")
    @Expose
    private Long minutesAwake;
    @SerializedName("minutesToFallAsleep")
    @Expose
    private Long minutesToFallAsleep;
    @SerializedName("startTime")
    @Expose
    private String startTime;
    @SerializedName("timeInBed")
    @Expose
    private Long timeInBed;
    @SerializedName("type")
    @Expose
    private String type;

    /**
     * @return The dateOfSleep
     */
    public String getDateOfSleep() {
        return dateOfSleep;
    }

    /**
     * @param dateOfSleep The dateOfSleep
     */
    public void setDateOfSleep(String dateOfSleep) {
        this.dateOfSleep = dateOfSleep;
    }

    /**
     * @return The duration
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * @param duration The duration
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * @return The efficiency
     */
    public Double getEfficiency() {
        return efficiency;
    }

    /**
     * @param efficiency The efficiency
     */
    public void setEfficiency(Double efficiency) {
        this.efficiency = efficiency;
    }

    /**
     * @return The mainSleep
     */
    public Boolean getMainSleep() {
        return isMainSleep;
    }

    /**
     * @param mainSleep The mainSleep
     */
    public void setMainSleep(Boolean mainSleep) {
        isMainSleep = mainSleep;
    }

    /**
     * @return The levels
     */
    public SleepLevel getLevels() {
        return levels;
    }

    /**
     * @param levels The levels
     */
    public void setLevels(SleepLevel levels) {
        this.levels = levels;
    }

    /**
     * @return the logId
     */
    public String getLogId() {
        return logId;
    }

    /**
     * @param logId The logId
     */
    public void setLogId(String logId) {
        this.logId = logId;
    }

    /**
     * @return The minutesAfterWakeup
     */
    public Long getMinutesAfterWakeup() {
        return minutesAfterWakeup;
    }

    /**
     * @param minutesAfterWakeup The minutesAfterWakeup
     */
    public void setMinutesAfterWakeup(Long minutesAfterWakeup) {
        this.minutesAfterWakeup = minutesAfterWakeup;
    }

    /**
     * @return The minutesAsleep
     */
    public Long getMinutesAsleep() {
        return minutesAsleep;
    }

    /**
     * @param minutesAsleep The minutesAsleep
     */
    public void setMinutesAsleep(Long minutesAsleep) {
        this.minutesAsleep = minutesAsleep;
    }

    /**
     * @return The minutesAwake
     */
    public Long getMinutesAwake() {
        return minutesAwake;
    }

    /**
     * @param minutesAwake The minutesAwake
     */
    public void setMinutesAwake(Long minutesAwake) {
        this.minutesAwake = minutesAwake;
    }

    /**
     * @return The minutesToFallAsleep
     */
    public Long getMinutesToFallAsleep() {
        return minutesToFallAsleep;
    }

    /**
     * @param minutesToFallAsleep The minutesToFallAsleep
     */
    public void setMinutesToFallAsleep(Long minutesToFallAsleep) {
        this.minutesToFallAsleep = minutesToFallAsleep;
    }

    /**
     * @return The startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime The startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return The timeInBed
     */
    public Long getTimeInBed() {
        return timeInBed;
    }

    /**
     * @param timeInBed The timeInBed
     */
    public void setTimeInBed(Long timeInBed) {
        this.timeInBed = timeInBed;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }
}
