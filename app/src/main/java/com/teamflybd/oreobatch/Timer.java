package com.teamflybd.oreobatch;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Timer extends AppCompatActivity {
    Button timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        timer = findViewById(R.id.timer);

        final Handler handler = new Handler();

        timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Runnable run = new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(Timer.this, "Button pressed", Toast.LENGTH_SHORT).show();

                        handler.postDelayed(this,10000);
                    }
                };
                handler.post(run);
            }
        });


    }
}
