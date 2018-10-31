package com.example.sungbin.management;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActicity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_acticity);

        EditText idText =(EditText)findViewById(R.id.idText);
        EditText passwordText =(EditText)findViewById(R.id.passwordText);


        Button loginButton =(Button)findViewById(R.id.loginButton);
        TextView registerButton=(TextView)findViewById(R.id.registerButton);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent;
                registerIntent = new Intent(LoginActicity.this,RegisterActivity.class);
                LoginActicity.this.startActivity(registerIntent);
            }
        });
    }
}
