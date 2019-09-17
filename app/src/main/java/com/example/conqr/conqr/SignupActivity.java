package com.example.conqr.conqr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class SignupActivity extends AppCompatActivity
{
    EditText namefield;
    EditText dobfield;
    EditText usernamefield;
    EditText passwordfield;

    public void signup (View view)
    {
        Log.i("AppInfo", String.valueOf(namefield.getText()));
        Log.i("AppInfo", String.valueOf(dobfield.getText()));
        Log.i("AppInfo", String.valueOf(usernamefield.getText()));
        Log.i("AppInfo", String.valueOf(passwordfield.getText()));
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        namefield = (EditText) findViewById(R.id.namein);
        dobfield = (EditText) findViewById(R.id.dobin);
        usernamefield = (EditText) findViewById(R.id.usernamein);
        passwordfield = (EditText) findViewById(R.id.passwordin);

    }
}
