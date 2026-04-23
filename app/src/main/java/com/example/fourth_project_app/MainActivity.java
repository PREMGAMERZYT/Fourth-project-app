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
    public static final String Second_name = "com.example.fourth_project_app.second.name";
    public static final  String Thired_name = "com.example.fourth_project_app.thired.name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextText);
    }
    public void opensecondsctivity(View v) {
        String Name = editText.getText().toString();
        if (Name.equals("Prem")) {
            Intent intent = new Intent(this,MainActivity2.class);
            intent.putExtra(Second_name,Name);
            startActivity(intent);
        } else if (Name.equals("prajwal")) {
            Intent intent = new Intent(this, message_reciver.class);
            intent.putExtra(EXTRA_NAME,Name);
            startActivity(intent);
        } else if (Name.equals("Three")) {
            Intent intent = new Intent(this,MainActivity3.class);
            intent.putExtra(Thired_name,Name);
            startActivity(intent);
        }
    }
    // learning implective intents
}