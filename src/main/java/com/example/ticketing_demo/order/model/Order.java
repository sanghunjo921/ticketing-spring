package com.example.ticketing_demo.order.model;

import com.example.ticketing_demo.ticket.model.Ticket;

public class Order {
    private static Integer id = 1;
    private Integer userId;
    private Ticket ticket;
    private double discountPrice;

    public Order(Integer userId, Ticket ticket, double discountPrice) {
        Order.id++;
        this.userId = userId;
        this.ticket = ticket;
        this.discountPrice = discountPrice;
    }

    public static Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public double calculateRealPrice() {
        return ticket.getPrice() - discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "userId=" + userId +
                ", ticket=" + ticket +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
