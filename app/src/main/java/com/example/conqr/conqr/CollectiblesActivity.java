package com.example.conqr.conqr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CollectiblesActivity extends AppCompatActivity {

    public void stickers (View view)
    {
        Intent intent = new Intent(this, StickersActivity.class);
        startActivity(intent);
    }

    public void badges (View view)
    {
        Intent intent = new Intent(this, BadgesActivity.class);
        startActivity(intent);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collectibles);
    }
}
