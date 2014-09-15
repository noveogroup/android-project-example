package com.noveogroup.android_application;

import android.app.Activity;
import android.os.Bundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AndroidApplicationActivity extends Activity {

    private static final Logger LOGGER = LoggerFactory.getLogger(AndroidApplicationActivity.class);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        LOGGER.info("AndroidApplicationActivity::onCreate");
    }

}
