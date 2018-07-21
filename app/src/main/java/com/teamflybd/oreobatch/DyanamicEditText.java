package com.teamflybd.oreobatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class DyanamicEditText extends AppCompatActivity {

    LinearLayout mLayout;
    Button button;
    DynamicHelper dh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dyanamic_edit_text);

        button = findViewById(R.id.btn);
        mLayout = findViewById(R.id.linearLayout);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dh = new DynamicHelper(DyanamicEditText.this);
                mLayout.addView(dh.dEditText(getApplicationContext()));
            }
        });


    }
}
