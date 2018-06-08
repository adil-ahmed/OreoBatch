package com.teamflybd.oreobatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentEmail extends AppCompatActivity {

    EditText toText,subjectText,messageText;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_email);

        Initialization();

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String receiptEmails = toText.getText().toString();
                String[] receiptEmailList = receiptEmails.split(",");

                String subjectTextString = subjectText.getText().toString();
                String messageTextString = messageText.getText().toString();

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,receiptEmailList);
                intent.putExtra(Intent.EXTRA_SUBJECT,subjectTextString);
                intent.putExtra(Intent.EXTRA_TEXT,messageTextString);

                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent, "Select a email client"));
            }
        });


    }

    private void Initialization() {
        toText = findViewById(R.id.emailInput);
        subjectText = findViewById(R.id.subjectInput);
        messageText = findViewById(R.id.messageInput);

        sendButton = findViewById(R.id.send);
    }
}
