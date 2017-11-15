package com.codeclan.example.wordcounter.controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.codeclan.example.wordcounter.R;

public class AboutActivity extends AppCompatActivity {
    TextView aboutTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        this.aboutTextView = findViewById(R.id.about_textView);
        this.aboutTextView.setText("Yan Ren likes\nChinese food,\ndislikes bland food \nand smiles a lot");

    }
}
