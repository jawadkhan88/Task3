package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnCount_onClick(View view)
    {

        ((TextView)findViewById(R.id.textView)).setText(String.valueOf(counter++));

    }

    public void btnToast_onClick(View view)
    {
        String str = ((TextView)findViewById(R.id.textView)).getText().toString();

        Toast.makeText(this, str, Toast.LENGTH_LONG).show();
    }

    public void btnrandom_onClick(View view)
    {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("COUNTER", counter-1);
        this.startActivity(intent);
    }
}