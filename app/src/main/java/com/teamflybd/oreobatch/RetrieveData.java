package com.teamflybd.oreobatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class RetrieveData extends AppCompatActivity {

    Button receive;
    TextView text;
    Firebase ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve_data);

        receive = findViewById(R.id.receive);
        text = findViewById(R.id.text);

      //  ref = new Firebase("https://oreobatch-96d42.firebaseio.com/Name");

        receive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref = new Firebase("https://oreobatch-96d42.firebaseio.com/Name");
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String valueFromDatabase = dataSnapshot.getValue(String.class);
                        text.setText(valueFromDatabase);
                    }

                    @Override
                    public void onCancelled(FirebaseError firebaseError) {

                    }
                });
            }
        });
    }
}
