package com.example.week3hw2.controller;

import com.example.week3hw2.Task.Tasklist;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/task")
public class Taskcontrol {
    ArrayList<Tasklist> tasks = new ArrayList<>();

    @GetMapping("/getT")
    public ArrayList<Tasklist> getTasks() {
        return tasks;
    }

    @PostMapping("/add")
    public String addTask(@RequestBody Tasklist task) {
        tasks.add(task);
        return "task added";
    }

    @PutMapping("/update/{index}")
    public String updateTask(@PathVariable int index, @RequestBody Tasklist task) {
        tasks.set(index, task);
        return "task update:";
    }

    @DeleteMapping("/delete/{index}")
    public String deleteTask(@PathVariable int index) {
        tasks.remove(index);
        return "task delete";
    }
    public boolean status(){
        return status();
    }
    public ArrayList<Tasklist> gettaskes( ){
        return tasks("title");
    }

    private ArrayList<Tasklist> tasks(String title) {
        return null;
    }

}





