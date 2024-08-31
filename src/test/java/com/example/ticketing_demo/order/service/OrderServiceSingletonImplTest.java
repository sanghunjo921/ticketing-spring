package com.example.ticketing_demo.order.service;


import com.example.ticketing_demo.helper.SpringHelper;
import com.example.ticketing_demo.user.service.UserService;
import com.example.ticketing_demo.user.service.UserServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceSingletonImplTest {
    static ApplicationContext ac;
    static UserService userService;
    static UserService user2Service;

    @BeforeAll
    static void setUp() {
        ac = SpringHelper.getAnnotationContext();
        userService = ac.getBean("userService", UserServiceImpl.class);
        user2Service = ac.getBean("user2Service", UserServiceImpl.class);
    }


    @Test
    @DisplayName("Singleton test")
    void getINSTANCETest() {
        OrderServiceSingletonImpl service1 = OrderServiceSingletonImpl.getInstance();
        OrderServiceSingletonImpl service2 = OrderServiceSingletonImpl.getInstance();

        Assertions.assertThat(service1).isInstanceOf(OrderServiceSingletonImpl.class);
        Assertions.assertThat(service1).isSameAs(service2);
    }

    @Test
    @DisplayName("bean property singleton test")
    void getPropertyBeanSingletonTest() {
        Assertions.assertThat(userService.getUserRepository()).isSameAs(user2Service.getUserRepository());
    }

}