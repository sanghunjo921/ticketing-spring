package com.example.ticketing_demo.user.repo;

import com.example.ticketing_demo.user.model.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 실제 구현체에 component 달아야함
@Component
public class MemUserRepository implements UserRepository{
    private static Map<Integer, User> map = new HashMap<>();

    @Override
    public void save(User user) {
        map.put(user.getId(), user);
    }

    @Override
    public User findById(Integer id) {
        return map.get(id);
    }

    @Override
    public List<User> findAll() {
        return map.values().stream().toList();
    }

    @Override
    public void deleteById(Integer id) {
        map.remove(id);
    }
}
