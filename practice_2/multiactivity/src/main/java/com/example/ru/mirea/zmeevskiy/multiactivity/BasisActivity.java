package com.example.ru.mirea.zmeevskiy.multiactivity;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class BasisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basis);

        String text = (String) getIntent().getSerializableExtra("key");
        TextView textView = findViewById(R.id.editTextTextPersonName);
        textView.setText(text);
    }
}