package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText et1,et2;
    Integer Number1,result,Number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button)(findViewById(R.id.button));
        et1 = (EditText) (findViewById(R.id.num1));
        et2 = (EditText) (findViewById(R.id.num2));


        b.setOnClickListener(new View.OnClickListener() {
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
    }
}
