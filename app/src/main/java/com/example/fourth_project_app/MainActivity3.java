package com.example.fourth_project_app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity3 extends AppCompatActivity {
    public static final String Name_Of_Thired_secren = "com.example.fourth_project_app.name_of_thired_secren";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    public void Onclicking(View v) {
        Intent intent = new Intent(this, MainActivity4.class);
        TextView textView = findViewById(R.id.textView3);
        String Name22 = textView.getText().toString();
        intent.putExtra(Name_Of_Thired_secren,Name22);
        startActivity(intent);

    }
}