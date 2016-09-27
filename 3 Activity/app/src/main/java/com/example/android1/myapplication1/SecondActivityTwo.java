package com.example.android1.myapplication1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by android1 on 15.09.2016.
 */
public class SecondActivityTwo extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activitytwo);
    }
    public void SendText(View v)
    {
        EditText txt=(EditText)findViewById(R.id.editText);
        Intent i=new Intent(SecondActivityTwo.this,MainActivity.class);
        i.putExtra("MyData",txt.getText().toString());
        startActivity(i);
    }
}
