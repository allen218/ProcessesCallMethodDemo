package com.example.eventbus;

import android.app.Application;
import android.util.Log;

/**
 * .
 */

public class MyAppliocation extends Application {
    private static int i = 0;
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("haha", "onCreate: "+(i++));
    }
}
