package com.example.fourth_project_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    public void opensecondsctivity(View v) {
        Toast.makeText(this, "Openning second activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, message_reciver.class);
        startActivity(intent);
    }
}