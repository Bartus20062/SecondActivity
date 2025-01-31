package com.example.secondactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSecondActivity = findViewById(R.id.buttonSecondActivity);
        buttonSecondActivity.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("message", "Wital z Main Acitvity");
            startActivity(intent);
        });

    }
}