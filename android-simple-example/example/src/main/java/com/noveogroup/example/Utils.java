package com.noveogroup.example;

import java.util.Locale;

public final class Utils {

    private Utils() {
        throw new UnsupportedOperationException();
    }

    public static String process(String input) {
        return input.toUpperCase(Locale.US);
    }

}
