package com.example.conqr.conqr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    EditText usernamefield;
    EditText passwordfield;

    public void login(View view)
    {
        Log.i("AppInfo", String.valueOf(usernamefield.getText()));
        Log.i("AppInfo", String.valueOf(passwordfield.getText()));
        Intent intent = new Intent(this, CollectiblesActivity.class);
        startActivity(intent);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernamefield = (EditText) findViewById(R.id.username);
        passwordfield = (EditText) findViewById(R.id.password);
    }

    public void create (View view)
    {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }
}
