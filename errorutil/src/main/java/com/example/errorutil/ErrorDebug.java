package com.example.errorutil;

import android.util.Log;

public class ErrorDebug {

    private static final String TAG = "ErrorDebugApp";

    public static void e(String message) {
        Log.e(TAG, message);
    }
}
