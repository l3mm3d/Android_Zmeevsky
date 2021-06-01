package com.example.ru.mirea.zmeevskiy.data_tread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;

import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity  {
    Looper myLooper;

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Looper myLooper = new Looper();
        myLooper.start();

    }
    public void onClick(View view) throws UnsupportedEncodingException {

        Message msg = new Message();
        Bundle bundle = new Bundle();
        bundle.putString("KEY", "mirea");
        msg.setData(bundle);
        if (myLooper != null) {
            myLooper.handler.setEncoding(String.valueOf(msg));
        }
    }
}