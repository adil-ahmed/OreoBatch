package com.teamflybd.oreobatch;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter{
    Activity context;
    ArrayList<String> people;

    public ListViewAdapter(ListViewActivity context, ArrayList<String> people) {
        this.context = context;
        this.people = people;
    }

    @Override
    public int getCount() {
        return people.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null)
        {
            convertView = context.getLayoutInflater().inflate(R.layout.list_item, parent, false);
        }
        TextView peopleTextView = convertView.findViewById(R.id.listText);
        String peopleText = people.get(position).toString();
        peopleTextView.setText(peopleText);

        return convertView;
    }
}
