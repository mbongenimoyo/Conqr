package com.example.conqr.conqr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class ChangePassActivity extends AppCompatActivity{

    EditText oldfield;
    EditText passfield;
    EditText confirmfield;

    public void done (View view)
    {
        Log.i("AppInfo", String.valueOf(oldfield.getText()));
        Log.i("AppInfo", String.valueOf(passfield.getText()));
        Log.i("AppInfo", String.valueOf(confirmfield.getText()));

        Intent done = new Intent(this, MainActivity.class);
        startActivity(done);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.changepass);

        oldfield = (EditText) findViewById(R.id.oldpassword);
        passfield = (EditText) findViewById(R.id.newpassword);
        confirmfield = (EditText) findViewById(R.id.confirmpassword);
    }
}
