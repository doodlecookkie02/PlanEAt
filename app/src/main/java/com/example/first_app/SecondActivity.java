package com.example.first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    String check = "This is a test";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvMessage = (TextView) findViewById(R.id.tvMessage);
        String message;

        Intent intent = getIntent();

        message = intent.getStringExtra("Message");
        tvMessage.setText(message);

        Toast.makeText(this, "You sent a mssage:    " + message, Toast.LENGTH_LONG).show();

    }
}