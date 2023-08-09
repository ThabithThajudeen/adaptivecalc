/*
NAME - THABITH AHAMED THAJUDEEN
ID - 21013788
PRACTICAL ONE
-> CALCULATOR IMPLEMENTS ALL FUNCTIONALITIES INCLUDING INTEGER . DECIMAL AND MIXED INPUTS
-> COMMON ERROR HANDLING IS DONE USING THE TOAST USING THE TOAST CLASS.
ERROR HANDLING DONE FOR DIVIDE BY ZERO ERROR. NUMBER FORMAT EXCEPTION ERROR. ENTERING ONLY NUMBER IN THE CALCULATOR BEFORE BUTTON IS CLICKED.
NOT ENTERING ANY NUMBER BEFORE THE BUTTON IS CLICKED
-> Adaptive ui is created which was tested in pixel 6 pro and 8 fold out and three different images were added
 */



package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = findViewById(R.id.addButton);
        Button subtractButton = findViewById(R.id.substractButton);
        Button multiplicationButton = findViewById(R.id.MultiplicationButton);
        Button DivisionButton = findViewById(R.id.DivisionButton);
        EditText input1 = findViewById(R.id.firstNumber);
        EditText input2 = findViewById(R.id.secondNumber);
        TextView result = findViewById(R.id.Result);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input1.getText().toString().isEmpty() && input2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Please enter two numbers",Toast.LENGTH_LONG).show();
                    return;
                }

                else if (!input1.getText().toString().isEmpty()&& input2.getText().toString().isEmpty() || (input1.getText().toString().isEmpty()&& !input2.getText().toString().isEmpty())) {
                    Toast.makeText(MainActivity.this, "Please enter the other number as well", Toast.LENGTH_LONG).show();
                }
                try {


                    double i = Double.parseDouble(String.valueOf(input1.getText()));
                    double j = Double.parseDouble(String.valueOf(input2.getText()));
                    double r = i + j;
                    result.setText(String.valueOf(r));
                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this,"Please enter a number",Toast.LENGTH_SHORT).show();
                }
            }
        });
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input1.getText().toString().isEmpty() && input2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Please enter two numbers",Toast.LENGTH_LONG).show();
                    return;
                }


                else if (!input1.getText().toString().isEmpty()&& input2.getText().toString().isEmpty() || (input1.getText().toString().isEmpty()&& !input2.getText().toString().isEmpty())) {
                    Toast.makeText(MainActivity.this, "Please enter the other number as well", Toast.LENGTH_LONG).show();
                }
                try {


                    double i = Double.parseDouble(String.valueOf(input1.getText()));
                    double j = Double.parseDouble(String.valueOf(input2.getText()));
                    double r = i - j;
                    result.setText(String.valueOf(r));
                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this,"Please enter a number",Toast.LENGTH_SHORT).show();
                }
            }
        });
        multiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (input1.getText().toString().isEmpty() && input2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Please enter two numbers",Toast.LENGTH_LONG).show();
                    return;
                }

                else if (!input1.getText().toString().isEmpty()&& input2.getText().toString().isEmpty() || (input1.getText().toString().isEmpty()&& !input2.getText().toString().isEmpty())) {
                    Toast.makeText(MainActivity.this, "Please enter the other number as well", Toast.LENGTH_LONG).show();
                }

                try {


                    double i = Double.parseDouble(String.valueOf(input1.getText()));
                    double j = Double.parseDouble(String.valueOf(input2.getText()));
                    double r = i * j;
                    result.setText(String.valueOf(r));
                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this,"Please enter a number",Toast.LENGTH_SHORT).show();
                }
            }
        });
        DivisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input1.getText().toString().isEmpty() && input2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Please enter two numbers",Toast.LENGTH_LONG).show();
                    return;
                } else if (!input1.getText().toString().isEmpty()&& input2.getText().toString().isEmpty() || (input1.getText().toString().isEmpty()&& !input2.getText().toString().isEmpty())) {
                    Toast.makeText(MainActivity.this, "Please enter the other number as well", Toast.LENGTH_LONG).show();
                }
                {

                }

                try {


                    double i = Double.parseDouble(String.valueOf(input1.getText()));
                    double j = Double.parseDouble(String.valueOf(input2.getText()));
                    if (j != 0) {
                        double r = i / j;
                        result.setText(String.valueOf(r));
                    }
                    else {
                        Toast.makeText(MainActivity.this,"Error.Division by zero is impossible",Toast.LENGTH_SHORT).show();
                    }
                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this,"Please enter a number",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }}
