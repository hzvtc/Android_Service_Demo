package com.asd.activity;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class LocalService extends Service {
    private static final String TAG = "LocalService";
    public static final String SERVICE_DEMO="com.demo.SERVICE_DEMO";
    public LocalService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind:()");
        return null;
    }

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate()");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String action=intent.getAction();
        if(action.equals(SERVICE_DEMO)){
            Log.d(TAG, "onStartCommand()");
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy()");
        super.onDestroy();
    }
}
