package com.example.week3hw2q2.Customers;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Customer {
    private int id;
    private String Username;
    private String Balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getBalance(int balance) {
        return Balance= String.valueOf(100-balance);
    }

    public void setBalance(String balance) {

        Balance ="100";
    }
}
