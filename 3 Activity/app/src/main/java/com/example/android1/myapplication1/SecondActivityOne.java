package com.example.android1.myapplication1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by android1 on 15.09.2016.
 */
public class SecondActivityOne extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activityone);
    }
    public void BackButton(View v)
    {
        onBackPressed();
    }
}
