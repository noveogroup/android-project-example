package com.noveogroup.example;

public final class Utils {

    private Utils() {
        throw new UnsupportedOperationException();
    }

    public static String process(String input) {
        return input.toUpperCase();
    }

}
