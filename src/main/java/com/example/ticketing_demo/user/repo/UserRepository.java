package com.example.ticketing_demo.user.repo;

import com.example.ticketing_demo.user.model.User;

import java.util.List;

public interface UserRepository {
    void save(User user);

    User findById(Integer id);

    List<User> findAll();

    void deleteById(Integer id);
}
