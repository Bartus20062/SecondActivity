package com.example.secondactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);


        TextView textView = findViewById(R.id.textView);
        EditText name = findViewById(R.id.Name);
        EditText email = findViewById(R.id.email);
        EditText phone = findViewById(R.id.Surname);


        String message = getIntent().getStringExtra("message");
        textView.setText(message);
        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(v->{
            String [] dane = new String[]{name.getText().toString(), email.getText().toString(), phone.getText().toString()};
            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            intent.putExtra("dane",dane);
            startActivity(intent);
            finish();
        });

        };


    }
