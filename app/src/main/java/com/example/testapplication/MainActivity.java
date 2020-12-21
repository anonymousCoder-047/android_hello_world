package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.*;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button submitButton;
    private TextView resMsg;
    private EditText msgField;
    private TextView execTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = (Button) findViewById(R.id.submitMsg);
        msgField = (EditText) findViewById(R.id.msgField);
        resMsg = (TextView) findViewById(R.id.msgResult);
        execTime = (TextView) findViewById(R.id.execTime);
        submitButton.setOnClickListener(this::onClick);
        final long endTime = SystemClock.currentThreadTimeMillis();
        Log.d("EndTime", "onCreate Method(): "+endTime);
    }

    public void onClick(View v)
    {
        String msg = msgField.getText().toString();
        resMsg.setText(msg);
        final long endTime = SystemClock.currentThreadTimeMillis();
        Log.d("EndTime", "onClick Method(): "+endTime);
        execTime.setText(endTime+"ms");
    }
}