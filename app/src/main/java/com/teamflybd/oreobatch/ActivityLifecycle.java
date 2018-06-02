package com.teamflybd.oreobatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityLifecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

        /*Log */

        Log.i("Inside : ", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Inside : ", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Inside : ", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Inside : ", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Inside : ", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Inside : ", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Inside : ", "onDestroy");
    }
}
