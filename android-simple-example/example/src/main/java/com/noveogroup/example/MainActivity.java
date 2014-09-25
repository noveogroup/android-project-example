package com.noveogroup.example;

import android.app.Activity;
import android.os.Bundle;

import com.noveogroup.android_application.R;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainActivity extends Activity {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainActivity.class);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        LOGGER.info("MainActivity::onCreate");
    }

}
