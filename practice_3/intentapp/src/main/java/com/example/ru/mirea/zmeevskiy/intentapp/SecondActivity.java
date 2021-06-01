package com.example.ru.mirea.zmeevskiy.intentapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        Bundle arguments = getIntent().getExtras();
        if(arguments!=null){
            String name = arguments.get("date").toString();
            textView.setText(name);
        }
        setContentView(textView);
    }
}