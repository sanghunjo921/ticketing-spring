package com.example.ticketing_demo.order.service;

import com.example.ticketing_demo.order.model.Order;
import com.example.ticketing_demo.ticket.model.Ticket;
import com.example.ticketing_demo.user.model.User;
import com.example.ticketing_demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService{
    private UserService userService;
    private DiscountPolicy discountPolicy;

    // discountpolicy가 fixed랑 variable 두 개가 있어서 충돌나면 variable이름으로 찾게 설정가능 -> 가장 헷갈릴 수 있음
    // 또한, 어노테이션으로 component이름을 설정해서 찾을 수 있게 설정가능 -> 이름을 줬으니 어느정돈 앎
    // qualifier로 앞에 이름을 정확히 줘서 사용가능 -> 가장 많이 쓰임
    public OrderServiceImpl(@Qualifier("userServiceImpl") UserService userService, DiscountPolicy discountPolicy) {
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
