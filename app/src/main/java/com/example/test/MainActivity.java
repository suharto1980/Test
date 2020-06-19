package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button nxB;
    public EditText input;
    public String pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=findViewById(R.id.InputUesr);
        nxB=findViewById(R.id.nextB);
        pass=input.toString();
        nxB.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Intent intent;
        switch (view.getId()){

            case R.id.nextB:{
                intent=new Intent(MainActivity.this,TestActivity.class);
                startActivity(intent);
               break;
            }


        }

    }
}