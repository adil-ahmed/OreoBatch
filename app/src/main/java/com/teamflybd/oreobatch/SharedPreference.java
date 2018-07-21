package com.teamflybd.oreobatch;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class SharedPreference extends AppCompatActivity {

    EditText username,password;
    Button submit;
    CheckBox rememberMe;
    Boolean save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        submit = findViewById(R.id.submit);

        rememberMe = findViewById(R.id.checkBox);

        SharedPreferences sharedPreferences = getSharedPreferences("LoginReference",MODE_PRIVATE);

        final SharedPreferences.Editor editor = sharedPreferences.edit();



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameText = username.getText().toString();
                String passwordText = password.getText().toString();

                if(usernameText.equals("Adil") && passwordText.equals("Adil"))
                {
                    Toast.makeText(SharedPreference.this, "Matched", Toast.LENGTH_SHORT).show();

                    if(rememberMe.isChecked())
                    {
                        editor.putBoolean("savelogin",true);
                        editor.putString("username",usernameText);
                        editor.putString("password",passwordText);
                        editor.commit();
                    }
                }
                else {
                    Toast.makeText(SharedPreference.this, "Did not match!", Toast.LENGTH_SHORT).show();
                }


            }
        });

        save = sharedPreferences.getBoolean("savelogin",true);

        if(save == true)
        {
            username.setText(sharedPreferences.getString("username",null));
            password.setText(sharedPreferences.getString("password",null));
        }

    }
}
