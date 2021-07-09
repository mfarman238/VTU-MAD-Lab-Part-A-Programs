package com.example.caluclatorr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.etnum1);
        num2=(EditText)findViewById(R.id.etnum2);
        add= (Button)findViewById(R.id.btnadd);
        sub= (Button)findViewById(R.id.btnsub);
        mul= (Button)findViewById(R.id.btnmul);
        div= (Button)findViewById(R.id.btndiv);
        result=(TextView)findViewById(R.id.tvans);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number1=Float.parseFloat( num1.getText().toString());
                float number2=Float.parseFloat( num2.getText().toString());
                float sum = number1+ number2;
                result.setText("Answer" + String.valueOf(sum));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number1=Float.parseFloat( num1.getText().toString());
                float number2=Float.parseFloat( num2.getText().toString());
                float sum = number1- number2;
                result.setText("Answer" + String.valueOf(sum));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number1=Float.parseFloat( num1.getText().toString());
                float number2=Float.parseFloat( num2.getText().toString());
                float sum = number1* number2;
                result.setText("Answer" + String.valueOf(sum));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number1=Float.parseFloat( num1.getText().toString());
                float number2=Float.parseFloat( num2.getText().toString());
                float sum = number1 / number2;
                result.setText("Answer" + String.valueOf(sum));
            }
        });


    }
}