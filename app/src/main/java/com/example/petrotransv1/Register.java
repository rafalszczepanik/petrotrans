package com.example.petrotransv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        final TextView registerText = (TextView) findViewById(R.id.loginText);
        registerText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent intent=new Intent(Register.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });





    }
}