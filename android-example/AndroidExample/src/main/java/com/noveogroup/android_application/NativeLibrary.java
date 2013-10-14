package com.noveogroup.android_application;

public final class NativeLibrary {

    private NativeLibrary() {
        throw new UnsupportedOperationException();
    }

    static {
        System.loadLibrary("AndroidExample");
    }

    public static native int sum(int a, int b);

    public static native String getUTF8String();

}
