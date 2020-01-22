package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b_add,b_sub,b_mul,b_div;
    EditText et1,et2;
    Integer Number1,result,Number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_add = (Button)(findViewById(R.id.add));
        b_sub = (Button)(findViewById(R.id.sub));
        b_mul = (Button)(findViewById(R.id.mul));
        b_div = (Button)(findViewById(R.id.div));
        et1 = (EditText) (findViewById(R.id.num1));
        et2 = (EditText) (findViewById(R.id.num2));


        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = et1.getText().toString();
                String number2 = et2.getText().toString();
                Number1 = Integer.parseInt(number1);
                Number2 = Integer.parseInt(number2);
                result = Number1+Number2;
                Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_LONG).show();
            }
        });
        b_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = et1.getText().toString();
                String number2 = et2.getText().toString();
                Number1 = Integer.parseInt(number1);
                Number2 = Integer.parseInt(number2);
                result = Number1-Number2;
                Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_LONG).show();
            }
        });
        b_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = et1.getText().toString();
                String number2 = et2.getText().toString();
                Number1 = Integer.parseInt(number1);
                Number2 = Integer.parseInt(number2);
                result = Number1*Number2;
                Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_LONG).show();
            }
        });
        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = et1.getText().toString();
                String number2 = et2.getText().toString();
                Number1 = Integer.parseInt(number1);
                Number2 = Integer.parseInt(number2);
                result = Number1/Number2;
                Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_LONG).show();
            }
        });
    }
}
