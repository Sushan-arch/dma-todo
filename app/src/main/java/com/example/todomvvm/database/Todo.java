package com.example.todomvvm.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "todos")
public class Todo {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String description;
    private String title;
    private int priority;
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @ColumnInfo(name = "updated_at")
    private Date updatedAt;


    public Todo(int id, String description, String title, int priority, String time, Date updatedAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.updatedAt = updatedAt;
        this.time = time;
    }

    @Ignore
    public Todo(String title, String description, int priority, String time, Date updatedAt) {
        this.description = description;
        this.title = title;
        this.priority = priority;
        this.updatedAt = updatedAt;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}

