package com.example.ticketing_demo.config;

import com.example.ticketing_demo.order.service.DiscountPolicy;
import com.example.ticketing_demo.order.service.FixedDiscountPolicy;
import com.example.ticketing_demo.order.service.OrderService;
import com.example.ticketing_demo.order.service.OrderServiceImpl;
import com.example.ticketing_demo.user.repo.MemUserRepository;
import com.example.ticketing_demo.user.repo.UserRepository;
import com.example.ticketing_demo.user.service.UserService;
import com.example.ticketing_demo.user.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public UserRepository userRepository() {
        return new MemUserRepository();
    }

    @Bean
    public UserService userService() {
        return new UserServiceImpl(userRepository());
    }

    @Bean
    public UserService user2Service() {
        return new UserServiceImpl(userRepository());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new FixedDiscountPolicy();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(userService(), discountPolicy());
    }



}
