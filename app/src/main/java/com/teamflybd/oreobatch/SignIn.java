package com.teamflybd.oreobatch;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignIn extends AppCompatActivity {
    Button signIn,signUp;

    EditText email,password;

    FirebaseAuth firebaseAuth;
    FirebaseAuth.AuthStateListener authStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        initialization();

        firebaseAuth = FirebaseAuth.getInstance();

        authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                //  FirebaseUser user = firebaseAuth.getCurrentUser();
            }
        };

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailText = email.getText().toString().trim();//ommit fore space
                String passText = password.getText().toString().trim();

                if (TextUtils.isEmpty(emailText) || TextUtils.isEmpty(passText))
                {

                    Toast.makeText(SignIn.this, "Give Data", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    firebaseAuth.signInWithEmailAndPassword(emailText,passText).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!(task.isComplete())) {
                                Toast.makeText(SignIn.this, "Error", Toast.LENGTH_SHORT).show();
                            }
                            if(task.isSuccessful())
                            {
                                startActivity(new Intent(SignIn.this,MainActivity.class));
                            }

                            else if(!(task.isSuccessful()))
                            {
                                Toast.makeText(SignIn.this, "Wrong email and password", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
    }

    private void initialization() {

        signIn = findViewById(R.id.signin);
        signUp = findViewById(R.id.signup);

        email = findViewById(R.id.emailText);
        password = findViewById(R.id.passwordText);
    }

    @Override
    protected void onStart() {
        super.onStart();
        firebaseAuth.addAuthStateListener(authStateListener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (authStateListener != null) {
            firebaseAuth.removeAuthStateListener(authStateListener);
        }
    }

//    private void signOut() {
//        firebaseAuth.signOut();
//
//    }
}
