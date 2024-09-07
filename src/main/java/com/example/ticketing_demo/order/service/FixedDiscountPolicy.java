package com.example.ticketing_demo.order.service;

import com.example.ticketing_demo.ticket.model.Ticket;
import com.example.ticketing_demo.user.model.Level;
import com.example.ticketing_demo.user.model.User;
import org.springframework.stereotype.Component;

@Component("discountPolicy")
public class FixedDiscountPolicy implements DiscountPolicy{

    @Override
    public double discount(User user, Ticket ticket) {
        if (user.getLevel() == Level.PLATINUM) {
            return 1000;
        }
        return 0;
    }
}
