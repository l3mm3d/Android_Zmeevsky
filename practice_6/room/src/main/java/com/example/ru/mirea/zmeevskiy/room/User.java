package com.example.ru.mirea.zmeevskiy.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    public long id;
    public String name;
    public int salary;
}
