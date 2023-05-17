package com.example.week3hw2.Task;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Tasklist {
    private String id;
    private String title;
    private String description;
    private boolean status;

//    for(String titles:tasks){
//        if()
//


    public String getTitle() {
        return title;
    }
}
