package com.teamflybd.oreobatch;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class ActivityLifecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        /** ActionBar */
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        /** ActionBar */

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


    /**
     * Creating menu by inflate
     */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    /**Clcking item of menu*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.about)
        {
            Toast.makeText(this, "Clicked on about", Toast.LENGTH_SHORT).show();
        }

        else if( id == R.id.setting)
        {
            Toast.makeText(this, "Clicked on Setting", Toast.LENGTH_SHORT).show();
        }

        else if( id == android.R.id.home)
        {
            Intent intent = new Intent(ActivityLifecycle.this,ProgressDialogActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
