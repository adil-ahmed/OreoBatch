package com.teamflybd.oreobatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listview);

        people = new ArrayList<String>();

        people.add("Talha");
        people.add("Shakil");
        people.add("Ifthekhar");
        people.add("Zawad");
        people.add("Kamran");
        people.add("Adil");
        people.add("Oreo");

        ListViewAdapter adapter = new ListViewAdapter(this,people);

        listView.setAdapter(adapter);


    }
}
