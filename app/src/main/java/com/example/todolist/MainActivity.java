package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> tasks;
    private ArrayAdapter<String> tasksAdapter;
    private ListView lvTasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListView
        lvTasks = (ListView) findViewById(R.id.lvTask);
        tasks = new ArrayList<String>();
        tasksAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, tasks);
        lvTasks.setAdapter(tasksAdapter);
        tasks.add("Send the project");
        tasks.add("Groceries");
    }

}