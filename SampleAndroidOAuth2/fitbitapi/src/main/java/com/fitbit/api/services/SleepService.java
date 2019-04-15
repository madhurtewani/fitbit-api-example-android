package com.fitbit.api.services;

import android.app.Activity;
import android.content.Loader;

import com.fitbit.api.exceptions.MissingScopesException;
import com.fitbit.api.exceptions.TokenExpiredException;
import com.fitbit.api.loaders.ResourceLoaderFactory;
import com.fitbit.api.loaders.ResourceLoaderResult;
import com.fitbit.api.models.SleepLogs;
import com.fitbit.authentication.Scope;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by madhurtewani on 5/4/19.
 */
public class SleepService {

    private final static String SLEEP_SINGLE_URL = "https://api.fitbit.com/1.2/user/-/sleep/date/%s.json";
    private final static String SLEEP_MULTIPLE_URL = "https://api.fitbit.com/1.2/user/-/sleep/date/%s/%s.json";
    private static final ResourceLoaderFactory<SleepLogs> SLEEP_SINGLE_LOG_LOADER_FACTORY = new ResourceLoaderFactory<>(SLEEP_SINGLE_URL, SleepLogs.class);
    private static final ResourceLoaderFactory<SleepLogs> SLEEP_MULTIPLE_LOG_LOADER_FACTORY = new ResourceLoaderFactory<>(SLEEP_MULTIPLE_URL, SleepLogs.class);
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    public static Loader<ResourceLoaderResult<SleepLogs>> getSleepLogLoader(Activity activityContext, Date date) throws MissingScopesException, TokenExpiredException {
        return SLEEP_SINGLE_LOG_LOADER_FACTORY.newResourceLoader(
                activityContext,
                new Scope[]{Scope.sleep},
                dateFormat.format(date));
    }

    public static Loader<ResourceLoaderResult<SleepLogs>> getSleepLogLoader(Activity activityContext, Date startDate, Date endDate) throws MissingScopesException, TokenExpiredException {
        return SLEEP_MULTIPLE_LOG_LOADER_FACTORY.newResourceLoader(
                activityContext,
                new Scope[]{Scope.sleep},
                dateFormat.format(startDate),
                dateFormat.format(endDate));
    }

}
