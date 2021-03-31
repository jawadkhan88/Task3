package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = this.getIntent();
        int counter = intent.getIntExtra("COUNTER",0);

        Random rand = new Random();
        int randomNum = rand.nextInt(counter);

        String newString = this.getString(R.string.msg_display, counter);

        ((TextView)findViewById(R.id.textView3)).setText(newString);

        ((TextView)findViewById(R.id.textView4)).setText(String.valueOf(randomNum));
    }
}