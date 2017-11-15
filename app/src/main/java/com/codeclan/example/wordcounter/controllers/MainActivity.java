package com.codeclan.example.wordcounter.controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.codeclan.example.wordcounter.R;
import com.codeclan.example.wordcounter.models.WordCounter;
import com.codeclan.example.wordcounter.models.WordCounterExtended;

/**
 * Created by sandy on 26/10/2016.
 */
public class MainActivity extends AppCompatActivity {

    EditText editText;

    Button buttonWordCount;
    Button buttonConcordance;
    WordCounterExtended wordCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.text_to_scan);
        buttonWordCount = (Button)findViewById(R.id.button_scan);
        buttonConcordance = (Button)findViewById(R.id.button_concordance);

    }

    public void onWordCountButtonClick(View view) {
        String textToScan = editText.getText().toString();
        Log.d("WordCounter", "Counting words in : '" + textToScan + "'");
        wordCounter = new WordCounterExtended(textToScan);

        int wordCountResult = wordCounter.getCount();

        Intent intent = new Intent(this, CountActivity.class);

        intent.putExtra("answer", Integer.toString(wordCountResult));
        startActivity(intent);


    }

    public void onConcordanceButtonClick(View view) {
        String textToScan = editText.getText().toString();
        Log.d("WordCounter", "Creating concordance for : '" + textToScan + "'");

        WordCounterExtended wordCounter = new WordCounterExtended(textToScan);
        String wordCountResult = wordCounter.toString();

        Intent intent = new Intent(this, CountActivity.class);

        intent.putExtra("answer", wordCountResult);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == R.id.action_about) {
            Toast.makeText(this, "Leaving for the About page", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.action_settings) {
            Toast.makeText(this, "Leaving for Setting page", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,SettingsActivity.class);
            startActivity(intent);

        }
        return true;

    }

}





































