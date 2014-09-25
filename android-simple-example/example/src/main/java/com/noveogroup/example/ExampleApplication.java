package com.noveogroup.example;

import android.app.Application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleApplication extends Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleApplication.class);

    @Override
    public void onCreate() {
        super.onCreate();
        LOGGER.info("ExampleApplication::onCreate");
    }

}
