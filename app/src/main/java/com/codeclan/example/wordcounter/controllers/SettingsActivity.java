package com.codeclan.example.wordcounter.controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.codeclan.example.wordcounter.R;

public class SettingsActivity extends AppCompatActivity {
    TextView settingsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        this.settingsTextView = findViewById(R.id.settings_textView);

        this.settingsTextView.setText("Feature coming soon");
    }
}
