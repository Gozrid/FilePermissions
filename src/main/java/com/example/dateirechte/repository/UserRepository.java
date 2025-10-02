package com.example.dateirechte.repository;

import com.example.dateirechte.models.User;

public class UserRepository {

    public User getUser(int userId) {
        return new User("Peter", "G1");
    }

}
