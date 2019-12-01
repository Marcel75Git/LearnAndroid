package com.example.learnandroidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class ActivityMyAdapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_adapter);

        ArrayList<User> usersArray = new ArrayList<>();
        usersArray.add(new User("user 1", "user 1", R.drawable.flageng));
        usersArray.add(new User("user 2", "user 2", R.drawable.flageng));

    }
}
