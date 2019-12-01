package com.example.learnandroidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class TemperatureConverter extends AppCompatActivity {
  private EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_converter);

         text = (EditText) findViewById(R.id.editText);
         text.setOnKeyListener(new View.OnKeyListener() {
             @Override
             public boolean onKey(View v, int keyCode, KeyEvent event) {
                 if(event.getAction() == KeyEvent.ACTION_DOWN) return  false;

                 if(keyCode== KeyEvent.KEYCODE_ENTER){
                     doConversation();
                     return true;
                 }else{return  false;}
             }
         });


    }


    private void doConversation(){
        RadioButton celcius = (RadioButton) findViewById(R.id.r1);
        RadioButton fahrenheit = (RadioButton) findViewById(R.id.r2);


        if(text.getText().length()== 0){
            Toast.makeText(this, "please a valid", Toast.LENGTH_LONG).show();
            return;
        }
        float inputValiu = Float.parseFloat(text.getText().toString());
        if(celcius.isChecked()){
            text.setText(String.valueOf(convertFahrtoCel(inputValiu)));
            celcius.setChecked(false);
            fahrenheit.setChecked(true);
        }else{
            text.setText(String.valueOf(convertCelToFahr(inputValiu)));
            celcius.setChecked(true);
            fahrenheit.setChecked(false);
        }
    }

    private float convertFahrtoCel(float fah){
        return ((fah - 32 ) *5 /9);
    }

    private float convertCelToFahr(float celcius){
        return ((celcius - 9 ) *5 + 32);
    }
}
