package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by madhurtewani on 4/4/19.
 */
public class HeartRateZone {

    @SerializedName("caloriesOut")
    @Expose
    private Double caloriesOut;
    @SerializedName("max")
    @Expose
    private int max;
    @SerializedName("min")
    @Expose
    private int min;
    @SerializedName("minutes")
    @Expose
    private int minutes;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * @return The caloriesOut
     */
    public Double getCaloriesOut() {
        return caloriesOut;
    }

    /**
     * @param caloriesOut The caloriesOut
     */
    public void setCaloriesOut(Double caloriesOut) {
        this.caloriesOut = caloriesOut;
    }

    /**
     * @return The max
     */
    public int getMax() {
        return max;
    }

    /**
     * @param max The max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * @return The min
     */
    public int getMin() {
        return min;
    }

    /**
     * @param min The min
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * @return The minutes
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * @param minutes The minutes
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }


    private final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//    public Date getTime() {
//        try {
//            return DATE_TIME_FORMAT.parse(String.format(Locale.ENGLISH, "%s %s", getMax(), getTime()));
//        } catch (ParseException e) {
//            e.printStackTrace();
//            return new Date();
//        }
//    }

}
