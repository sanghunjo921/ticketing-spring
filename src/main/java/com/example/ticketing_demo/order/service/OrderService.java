package com.example.ticketing_demo.order.service;

import com.example.ticketing_demo.order.model.Order;
import com.example.ticketing_demo.ticket.model.Ticket;

public interface OrderService {

    Order order(Integer usereId, Ticket ticket);
}
