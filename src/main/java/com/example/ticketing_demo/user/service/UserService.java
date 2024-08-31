package com.example.ticketing_demo.user.service;

import com.example.ticketing_demo.user.model.User;
import com.example.ticketing_demo.user.repo.UserRepository;

import java.util.List;

public interface UserService {
    void save(User user);

    User findById(Integer id);

    List<User> findAll();

    void deleteById(Integer id);

    UserRepository getUserRepository();
}
