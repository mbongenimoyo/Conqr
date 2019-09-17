package com.example.conqr.conqr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class SettingsActivity extends AppCompatActivity
{
    public void changepass (View view)
    {
        Intent passwordpage = new Intent(this, ChangePassActivity.class);
        startActivity(passwordpage);
    }

    public void help (View view)
    {
        Intent helppage = new Intent(this, HelpActivity.class);
        startActivity(helppage);
    }

    public void logout (View view)
    {
        Intent logoutpage = new Intent(this, MainActivity.class);
        startActivity(logoutpage);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
    }
}
