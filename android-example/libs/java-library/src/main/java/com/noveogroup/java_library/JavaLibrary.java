package com.noveogroup.java_library;

import android.content.Context;

import com.google.gson.Gson;

public final class JavaLibrary {

    private JavaLibrary() {
        throw new UnsupportedOperationException();
    }

    public static String getUTF8String() {
        return "Bon après-midi";
    }

    public static Gson createGson() {
        return new Gson();
    }

    public static String useAndroid(Context context) {
        return context.getPackageName();
    }

}
