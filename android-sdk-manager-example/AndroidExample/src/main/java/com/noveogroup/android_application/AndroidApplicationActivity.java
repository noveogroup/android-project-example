package com.noveogroup.android_application;

import android.app.Activity;
import android.os.Bundle;

public class AndroidApplicationActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
