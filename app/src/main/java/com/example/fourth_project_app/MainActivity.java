package com.example.fourth_project_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    public static final String EXTRA_NAME = "com.example.fourth_project_app.extra.name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextText);
    }
    public void opensecondsctivity(View v) {
        Toast.makeText(this, "Openning second activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, message_reciver.class);

        String nametext = editText.getText().toString();
        intent.putExtra(EXTRA_NAME,nametext);
        startActivity(intent);
    }
}