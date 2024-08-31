package com.example.ticketing_demo.order.service;

import com.example.ticketing_demo.order.model.Order;
import com.example.ticketing_demo.ticket.model.Ticket;
import com.example.ticketing_demo.user.model.User;
import com.example.ticketing_demo.user.service.UserService;

public class OrderServiceImpl implements OrderService{
    private UserService userService;
    private DiscountPolicy discountPolicy;


    public OrderServiceImpl(UserService userService, DiscountPolicy discountPolicy) {
        this.userService = userService;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order order(Integer userId, Ticket ticket) {
        User user = userService.findById(userId);
        double discountPrice = discountPolicy.discount(user, ticket);

        return new Order(userId, ticket, discountPrice);
    }
}
