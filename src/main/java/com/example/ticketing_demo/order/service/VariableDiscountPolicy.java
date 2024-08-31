package com.example.ticketing_demo.order.service;

import com.example.ticketing_demo.ticket.model.Ticket;
import com.example.ticketing_demo.user.model.Level;
import com.example.ticketing_demo.user.model.User;

public class VariableDiscountPolicy implements DiscountPolicy{
    private final int DISCOUNT_RATE = 10;
    @Override
    public double discount(User user, Ticket ticket) {
        if (user.getLevel() == Level.PLATINUM) {
            return ticket.getPrice() * DISCOUNT_RATE / 100;
        }
        return 0;
    }
}
