package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText userN;
    private TextView v;
    private Button submitB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        userN=findViewById(R.id.InputUesrNAme);

        v=findViewById(R.id.View);

        String vv="sss";

        v.setText(vv);
        submitB=findViewById(R.id.Submit);

        submitB.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Intent intent;
        switch (view.getId()){

            case R.id.Submit:{
                //intent=new Intent(this,TestActivity.class);
                //startActivity(intent);
                dataView();
                break;
            }


        }

    }

    public void dataView(){
       EditText user=findViewById(R.id.InputUesrNAme);
    }

}