package com.example.ru.mirea.zmeevskiy.room;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserDatabase db = App.getInstance().getDatabase();
        UserDao employeeDao = db.employeeDao();
        User user = new User();
        user.id = 1;
        user.name = "John Smith";
        user.salary = 10000;
        // запись сотрудников в базу
        employeeDao.insert(user);
        // Загрузка всех работников
        List<User> employees = employeeDao.getAll();
        // Получение определенного работника с id = 1
        user = employeeDao.getById(1);
        // Обновление полей объекта
        user.salary = 20000;
        employeeDao.update(user);

        Log.d(TAG, user.name + " " + user.salary);
    }
}