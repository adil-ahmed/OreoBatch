package com.teamflybd.oreobatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class AnimationActivity extends AppCompatActivity {

    ImageView cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        cat = findViewById(R.id.cat);

        int duration,x,y;

        duration = 10000; // speed decreses as time increased
        x = 360; // x-axis (if +ve move to right.if -ve move to left)
        y = 400; // y-axis (if +ve move towards top.if -ve move towards bottom)

        cat.animate().translationX(x).translationY(y).setDuration(duration).start();
    }
}
