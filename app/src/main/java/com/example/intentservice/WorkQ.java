package com.example.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Anand on 02/10/2016.
 */

public class WorkQ extends IntentService {
    public WorkQ() {
        super("WorkQ");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try{
            if(intent.getExtras().containsKey("value")){
                int v = intent.getIntExtra("value", 0);
                Log.d("WorkQ", String.valueOf(v));
            }
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
