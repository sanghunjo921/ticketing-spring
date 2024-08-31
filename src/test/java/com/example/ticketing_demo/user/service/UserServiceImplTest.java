package com.example.ticketing_demo.user.service;

import com.example.ticketing_demo.config.AppConfig;
import com.example.ticketing_demo.user.model.User;
import com.example.ticketing_demo.helper.UserHelper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class UserServiceImplTest {

    AppConfig config = new AppConfig();
    UserService userService = config.userService();


    @Test
    @DisplayName("user save test")
    void saveAndFindByIdTest() {
        //given
        User user = UserHelper.getVIPUser();

        //when
        userService.save(user);
        User findUser = userService.findById(user.getId());

        //then
        Assertions.assertThat(user).isEqualTo(findUser);
    }

    @Test
    @DisplayName("user not found test")
    void findByWrongIdTest() {
        //given
        User user = UserHelper.getVIPUser();

        //when
        userService.save(user);
        User findUser = userService.findById(2);

        //then
        Assertions.assertThat(findUser).isEqualTo(null);
    }

}