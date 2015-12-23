package com.sinch.messagingtutorial.app;

import android.app.Application;
import com.parse.Parse;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "33zzf3rMq8gvVssFbD3vbZ8qCu14wgGr1u0pq7Fh", "2oosEMGazMT9sv8lKXiXY2hb9zjGkvSm9w5gpGCh");
    }
}
