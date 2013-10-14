package com.noveogroup.android_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.google.gson.Gson;
import com.noveogroup.android_library.AndroidLibraryActivity;
import com.noveogroup.java_library.JavaLibrary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class AndroidApplicationActivity extends Activity {

    private static final Logger LOGGER = LoggerFactory.getLogger(AndroidApplicationActivity.class);

    private static final long DELAY = 1000;

    public static String getUTF8String() {
        return "Bon après-midi";
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        LOGGER.info("AndroidApplicationActivity::onCreate");
        Gson gson = JavaLibrary.createGson();
        LOGGER.info("gson = " + gson);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(AndroidApplicationActivity.this, AndroidLibraryActivity.class));
            }
        }, DELAY);

        StringBuilder builder = new StringBuilder();

        builder.append(BuildConfig.SHOW_GREETINGS ? "show [" : "hide [").append(BuildConfig.GREETINGS).append("]\n");

        builder.append("JavaLibrary: ").append(JavaLibrary.getUTF8String()).append("\n");
        builder.append("AndroidLibrary: ").append(AndroidLibraryActivity.getUTF8String()).append("\n");
        builder.append("AndroidApplication: ").append(AndroidApplicationActivity.getUTF8String()).append("\n");
        builder.append("NativeLibrary: ").append(NativeLibrary.getUTF8String()).append("\n");
        builder.append("\n");

        builder.append("NativeLibrary.sum(2, 2) = ").append(NativeLibrary.sum(2, 2)).append("\n");

        try {
            builder.append("AndroidLibraryAsset: ").append(getAssets().open("AndroidLibraryAsset"));
        } catch (IOException e) {
            builder.append("AndroidLibraryAsset: ").append("error ").append(e);
        }

        TextView textView = (TextView) findViewById(R.id.info);
        textView.setText(builder.toString());
    }

}
