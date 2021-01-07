package com.semicolon.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        txtResult = (TextView)findViewById(R.id.textView);
    }

    public void addbtnClick(View view) {
        double  n1 = Double.parseDouble(num1.getText().toString());
        double n2 = Double.parseDouble(num2.getText().toString());
        double sum = n1+n2;
        txtResult.setText(String.valueOf(sum));
    }

    public void subbtnclick(View view) {
        double  n1 = Double.parseDouble(num1.getText().toString());
        double n2 = Double.parseDouble(num2.getText().toString());
        double sub = n1-n2;
        txtResult.setText(String.valueOf(sub));
    }

    public void multbtnclick(View view) {
        double  n1 = Double.parseDouble(num1.getText().toString());
        double n2 = Double.parseDouble(num2.getText().toString());
        double  mult = n1*n2;
        txtResult.setText(String.valueOf(mult));
    }

    public void divbtnclick(View view) {
        double  n1 = Double.parseDouble(num1.getText().toString());
        double n2 = Double.parseDouble(num2.getText().toString());
        double div = n1/n2;
        txtResult.setText(String.valueOf(div));
    }
}