package com.example.intentservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent work = new Intent(this, WorkQ.class);

        for (int i = 0; i < 5; i++) {
            work.putExtra("value", i);
            startService(work);
        }

        Log.d("WorkQ", "WorkQ has started");
    }
}
