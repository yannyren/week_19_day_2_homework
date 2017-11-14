package com.codeclan.example.wordcounter.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.codeclan.example.wordcounter.R;

public class CountActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        textView = findViewById(R.id.text_result);

        Intent intent = getIntent();

        Bundle extras = intent.getExtras();
        String countResult = extras.getString("answer");

        textView.setText(countResult);


    }





}
