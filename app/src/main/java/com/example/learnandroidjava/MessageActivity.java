package com.example.learnandroidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        TextView textView = (TextView) findViewById(R.id.text);
        Intent i =getIntent();

        if (i.hasExtra(IntentObject.messages)){
            Message msg =(Message) i.getSerializableExtra(IntentObject.messages);
            textView.setText(msg.getNom());
        }
    }
}
