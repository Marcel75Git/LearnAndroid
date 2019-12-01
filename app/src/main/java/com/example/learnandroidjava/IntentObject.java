package com.example.learnandroidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentObject extends AppCompatActivity {

    static final String messages = "Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_object);

        Button button = (Button) findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = ((EditText) findViewById(R.id.edit1)).getText().toString();
                String message = ((EditText) findViewById(R.id.edit2)).getText().toString();
                Message msg = new Message(title, message);

                Intent i = new Intent(getApplicationContext(), MessageActivity.class);
                i.putExtra(messages, msg);
                startActivity(i);
            }
        });
    }
}
