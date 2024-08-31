package com.example.ticketing_demo.order.service;

import com.example.ticketing_demo.ticket.model.Ticket;
import com.example.ticketing_demo.user.model.User;

public interface DiscountPolicy {
    double discount(User user, Ticket ticket);
}
