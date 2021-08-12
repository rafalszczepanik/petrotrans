package com.example.petrotransv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final TextView registerText = (TextView) findViewById(R.id.registerText);
        registerText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent intent=new Intent(MainActivity.this, Register.class);
                startActivity(intent);
                finish();
            }
        });

        Button btnLogin=(Button)findViewById(R.id.btn_Zaloguj);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainSite.class);
                startActivity(intent);
                finish();
            }
        });


    }

}