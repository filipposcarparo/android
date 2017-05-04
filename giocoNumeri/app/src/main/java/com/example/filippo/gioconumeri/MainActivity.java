package com.example.filippo.gioconumeri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button b;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random gen =new Random();
        final int a=gen.nextInt(20)+1;

        b= (Button) findViewById(R.id.button);
        editText= (EditText) findViewById(R.id.editText);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Integer.parseInt(editText.getText().toString())==a){
                    Toast.makeText(MainActivity.this, "Indovinato", Toast.LENGTH_SHORT).show();
                }else if(Integer.parseInt(editText.getText().toString())<a){
                    Toast.makeText(MainActivity.this, "numero più piccolo", Toast.LENGTH_SHORT).show();
                }else if(Integer.parseInt(editText.getText().toString())>a){
                    Toast.makeText(MainActivity.this, "numero più grande", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
