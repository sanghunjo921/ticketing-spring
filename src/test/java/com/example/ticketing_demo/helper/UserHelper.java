package com.example.ticketing_demo.helper;

import com.example.ticketing_demo.user.model.Level;
import com.example.ticketing_demo.user.model.User;

import java.util.List;

public class UserHelper {
    public static User getVIPUser() {
        return new User(1, "Test user1", Level.PLATINUM);
    }

    public static User getGeneralUser() {
        return new User(1, "Test user1", Level.GOLD);
    }

    public static List<User> getVipUsers() {
        return List.of(getVIPUser(), getGeneralUser());
    }
}
