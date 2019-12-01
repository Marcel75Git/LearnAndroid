package com.example.learnandroidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fragments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        final Button btn1 = (Button) findViewById(R.id.btn1);
        final Button btn2 = (Button) findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeGragment(btn1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeGragment2(btn2);
            }
        });

    }


    public void changeGragment(View view){
       Fragment fragment ;
       //if(view == findViewById(R.id.btn1)){
           fragment = new FirstFragment();
           FragmentManager fm = getFragmentManager();
           FragmentTransaction ft = fm.beginTransaction();
           ft.replace(R.id.idPlace, fragment);
           ft.commit();
       }

    public void changeGragment2(View view){
        //if (view == findViewById(R.id.btn2)) {
             Fragment fragment ;
            fragment = new SecondFragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.idPlace, fragment);
            ft.commit();
       // }
    }
}
