package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etfirstnumber = findViewById(R.id.editTextTextfirstnumber);
        EditText etsecondnumber = findViewById(R.id.editTextTextsecondnumber);
        TextView texttotal = findViewById(R.id.texttotal);
        Button calc = findViewById(R.id.buttoncalc);
        Button sub = findViewById(R.id.buttonsub);


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1 = etfirstnumber.getText().toString();
                int x =  Integer.parseInt(text1);

                String text2 = etsecondnumber.getText().toString();
                int y =  Integer.parseInt(text2);

                int z = sum (x , y);


                texttotal.setText(String.valueOf(z));

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1 = etfirstnumber.getText().toString();
                int x =  Integer.parseInt(text1);

                String text2 = etsecondnumber.getText().toString();
                int y =  Integer.parseInt(text2);

                int z = sub (x , y);


                texttotal.setText(String.valueOf(z));

            }
        });
    }

    public int sum (int x , int y) {
        int a = x + y ;
        return a ;
    }

    public int sub (int x , int y) {
        int n = x - y ;
        return n ;
    }


}