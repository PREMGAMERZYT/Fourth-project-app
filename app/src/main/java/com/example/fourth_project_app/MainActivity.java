package com.example.fourth_project_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText url;
    private Button button;
    public static final String EXTRA_NAME = "com.example.fourth_project_app.extra.name";
    public static final String Second_name = "com.example.fourth_project_app.second.name";
    public static final  String Thired_name = "com.example.fourth_project_app.thired.name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url = findViewById(R.id.editTextText);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String UrlText = url.getText().toString();
                Toast.makeText(MainActivity.this, UrlText, Toast.LENGTH_SHORT).show();
                Uri webpage = Uri.parse(UrlText);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                Intent chooser = Intent.createChooser(intent, "Open With");
                startActivity(chooser);


            }
        });
    }

    // learning Implicit intents
    //we can request any other app to perform any action
}