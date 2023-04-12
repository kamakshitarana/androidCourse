package com.example.widgetapp.UnitConverterApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.widgetapp.R;

public class UnitConverter extends AppCompatActivity {

    EditText edittext;
    TextView values;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_converter);

        edittext =findViewById(R.id.etEnterValues);
        values =findViewById(R.id.tv_value);
        button =findViewById(R.id.btnConvet_now);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double et_EnterValues = Double.parseDouble(edittext.getText().toString());  //typecasting

                values.setText(" "+convertToPounds(et_EnterValues));


            }
        });
    }

    public  double convertToPounds(double kilos){
         double pounds_result = kilos*2.20462;
         return  pounds_result;
    }
}