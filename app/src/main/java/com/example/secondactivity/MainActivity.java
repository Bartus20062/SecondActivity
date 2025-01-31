package com.example.secondactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSecondActivity = findViewById(R.id.buttonSecondActivity);
        buttonSecondActivity.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("message", "Witaj z Main Acitvity");
            startActivity(intent);
        });

        TextView name, email, surname;
        name = findViewById(R.id.name1);
        email = findViewById(R.id.name2);
        surname = findViewById(R.id.name3);
        String [] dane = getIntent().getStringArrayExtra("dane");
        if(dane!=null){
            name.setText(dane[0]);
            email.setText(dane[1]);
            surname.setText(dane[2]);

        }

    }
}