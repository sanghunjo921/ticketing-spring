package com.example.ticketing_demo.user.service;

import com.example.ticketing_demo.user.model.User;
import com.example.ticketing_demo.user.repo.MemUserRepository;
import com.example.ticketing_demo.user.repo.UserRepository;

import java.util.List;

public class UserServiceImpl implements  UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserRepository getUserRepository() {
        return userRepository;
    }
}
