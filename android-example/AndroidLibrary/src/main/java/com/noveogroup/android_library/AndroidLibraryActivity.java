package com.noveogroup.android_library;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;

import com.androidquery.AQuery;
import com.google.gson.Gson;
import com.noveogroup.java_library.JavaLibrary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AndroidLibraryActivity extends FragmentActivity {

    private static final Logger LOGGER = LoggerFactory.getLogger(AndroidLibraryActivity.class);

    public static String getUTF8String() {
        return "Bon après-midi";
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        LOGGER.info("AndroidLibraryActivity::onCreate");
        super.onCreate(savedInstanceState);
        Gson gson = JavaLibrary.createGson();
        LOGGER.info("gson created: {}", gson.hashCode());

        ImageView imageView = new ImageView(this);
        setContentView(imageView);
        new AQuery(imageView).image("https://www.google.ru/images/srpr/logo4w.png");
    }
}
