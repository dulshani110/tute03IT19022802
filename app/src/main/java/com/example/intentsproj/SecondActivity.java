package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText etNum1;
    EditText etNum2;
    String Number1;
    String Number2;
    TextView lblSum;

    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etNum1=findViewById(R.id.editTextNumber);
        etNum2=findViewById(R.id.editTextNumber2);
        lblSum=findViewById(R.id.lblSum);

        Intent intent =getIntent();
        //String Number1;
       // String Number2;

         Number1=intent.getStringExtra("n1");
         Number2=intent.getStringExtra("n2");
        etNum1.setText(Number1);
        etNum2.setText(Number2);

        n1=Integer.parseInt(Number1);
        n2=Integer.parseInt(Number2);



    }

    public void add(View view){
        lblSum.setText(Number1+ " + "+ Number2 + " = " + (n1+n2));
    }
    public void subStract(View view){
        lblSum.setText(Number1+ " - "+ Number2 + " = " + (n1-n2));
    }
    public void multiply(View view){
        lblSum.setText(Number1+ " * "+ Number2 + " = " + (n1*n2));
    }
    public void divide(View view){
        lblSum.setText(Number1+ " / "+ Number2 + " = " + (n1/n2));
    }
}