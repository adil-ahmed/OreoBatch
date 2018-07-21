package com.teamflybd.oreobatch;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.EditText;

public class DynamicHelper {
    Context context;

    public DynamicHelper(Context context) {
        this.context = context;
    }

    public EditText dEditText (Context context)
    {
        final ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        EditText editText = new EditText(context);
        editText.setTextColor(Color.rgb(255, 100, 40));
        editText.setLayoutParams(layoutParams);
        editText.setHint("Please insert something");
        editText.setEms(3);

        return editText;

    }











//    public EditText dEditText (Context context) {
//        final ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT);
//        final EditText editText = new EditText(context);
//        // int id = 0;
//        // editText.setId(id);
//        editText.setTextColor(Color.rgb(100, 255, 132));
//        editText.setMinEms(0); //It is the width of the letter M in a given English font size.
//        //So 2em is twice the width of the letter M in this given font.
//
//        return editText;
//    }

}
