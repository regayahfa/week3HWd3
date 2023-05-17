package com.example.week3hw2q2.contrrolbank;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/bank")
public class Bank {
    ArrayList<Bank> customerst = new ArrayList<>();

    @GetMapping("/get")
    public ArrayList<Bank> getCus() {
        return customerst;
    }

    @PostMapping("/add")
    public String addCus(@RequestBody  Bank datacus) {
        customerst.add(datacus);
        return "data added";

    }

    @PutMapping("/update/{index}")
    public String updateCus(@PathVariable int index,@RequestBody Bank cus) {
        customerst.set(index,cus);
        return "data update:";
    }
    @DeleteMapping("/delete/{index}")
    public String deleteCus(@PathVariable int index) {
        customerst.remove(index);
        return "data delete";
    }


}