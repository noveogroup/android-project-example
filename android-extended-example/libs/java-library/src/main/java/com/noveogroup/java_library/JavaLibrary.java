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

    private static boolean findClass(String className) {
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException ignored) {
            return false;
        }
    }

    public static String findLibraries() {
        String providedClassName = "com.noveogroup.provided_library.ProvidedLibrary";
        String requiredClassName = "com.noveogroup.required_library.RequiredLibrary";

        StringBuilder builder = new StringBuilder();
        builder.append("find libraries ...\n");
        builder.append(providedClassName).append(": ").append(findClass(providedClassName)).append("\n");
        builder.append(requiredClassName).append(": ").append(findClass(requiredClassName)).append("\n");
        return builder.toString();
    }

}
