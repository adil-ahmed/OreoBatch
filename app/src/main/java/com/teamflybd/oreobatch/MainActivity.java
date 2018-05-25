package com.teamflybd.oreobatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


/*
    Adil Ahmed Chowdhury
    Github integration
    Toast

 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void press(View view)
    {
        Toast.makeText(MainActivity.this,"Button has been pressed!!",Toast.LENGTH_LONG).show();
    }
}
