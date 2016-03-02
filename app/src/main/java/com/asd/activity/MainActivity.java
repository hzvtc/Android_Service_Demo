package com.asd.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.startService).setOnClickListener(this);
        findViewById(R.id.stopService).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent mIntent=new Intent();
        switch (view.getId()) {
            case R.id.startService:
                mIntent.setAction("com.demo.SERVICE_DEMO");
                mIntent.setPackage(getPackageName());
                startService(mIntent);
                break;
            case R.id.stopService:
                mIntent.setAction("com.demo.SERVICE_DEMO");
                mIntent.setPackage(getPackageName());
                stopService(mIntent);
                break;
        }
    }
}
