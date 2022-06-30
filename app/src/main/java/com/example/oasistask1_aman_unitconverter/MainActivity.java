package com.example.oasistask1_aman_unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private EditText editText1;
    private EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String s1= editText1.getText().toString();
            String s2= editText2.getText().toString();
                if (TextUtils.isEmpty(editText2.getText().toString())){
                float kg = Float.parseFloat(s1);
                double grams = kg * 1000;
                textView4.setText("The value is grams is " + grams);
                }
                else if (TextUtils.isEmpty(editText1.getText().toString())) {
                    float grams = Float.parseFloat(s2);
                    double kg = grams / 1000;
                    textView4.setText("The value is KiloGrams is " + kg);
                }
                else {
                    textView4.setText("Enter one value at a time");
                }
            }
        });
    }
}