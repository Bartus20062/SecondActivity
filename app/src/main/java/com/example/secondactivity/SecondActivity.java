package com.example.secondactivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
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
        textView.setText(getIntent().getStringExtra("message"));

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(v->{
            finish();
        });

    }
}