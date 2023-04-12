package com.example.widgetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //how to take input from user
        editText =findViewById(R.id.edittext);
        button =findViewById(R.id.button);
        //handling the click events on button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText =editText.getText().toString();
            //the button action to perform
                Toast.makeText(MainActivity.this, "hello" + inputText, Toast.LENGTH_SHORT).show();

            }
        });





    }
}





























