package com.fitbit.api.services;

import android.app.Activity;
import android.content.Loader;

import com.fitbit.api.exceptions.MissingScopesException;
import com.fitbit.api.exceptions.TokenExpiredException;
import com.fitbit.api.loaders.ResourceLoaderFactory;
import com.fitbit.api.loaders.ResourceLoaderResult;
import com.fitbit.api.models.HeartRateLogs;
import com.fitbit.authentication.Scope;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by madhurtewani on 4/4/19.
 */
public class HeartRateService {

    private final static String HEART_RATE_URL = "https://api.fitbit.com/1/user/-/activities/heart/date/%s/%s.json";
    private static final ResourceLoaderFactory<HeartRateLogs> HEART_RATE_LOG_LOADER_FACTORY = new ResourceLoaderFactory<>(HEART_RATE_URL, HeartRateLogs.class);
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    public static Loader<ResourceLoaderResult<HeartRateLogs>> getHeartRateLogLoader(Activity activityContext, Date startDate, Date endDate) throws MissingScopesException, TokenExpiredException {
        return HEART_RATE_LOG_LOADER_FACTORY.newResourceLoader(
                activityContext,
                new Scope[]{Scope.heartrate},
                dateFormat.format(startDate),
                dateFormat.format(endDate));
    }

    public static Loader<ResourceLoaderResult<HeartRateLogs>> getHeartRatePeriodLogLoader(Activity activityContext, Date startDate, int calendarDateType, int number) throws MissingScopesException, TokenExpiredException {
        String periodSuffix = "d";
        switch (calendarDateType) {
            case Calendar.WEEK_OF_YEAR:
                periodSuffix = "w";
                break;
            case Calendar.MONTH:
                periodSuffix = "m";
                break;
        }

        return HEART_RATE_LOG_LOADER_FACTORY.newResourceLoader(
                activityContext,
                new Scope[]{Scope.heartrate},
                dateFormat.format(startDate),
                String.format(Locale.US, "%d%s", number, periodSuffix));
    }

}
