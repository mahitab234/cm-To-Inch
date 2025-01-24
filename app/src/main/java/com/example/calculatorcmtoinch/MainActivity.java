package com.example.calculatorcmtoinch;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn_click;
    EditText cm;
    TextView inch;
    double amount, result;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_click = findViewById(R.id.btn_click);
        cm = findViewById(R.id.et_cm);
        inch = findViewById(R.id.tv_inch);

        btn_click.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        amount = Double.parseDouble(cm.getText().toString());
                        result = amount/2.54;
                        inch.setText(String.format("%.2f",result));
                    }
                });
    }
}