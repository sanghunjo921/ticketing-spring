package com.example.ticketing_demo.ticket.model;

public class Ticket {
    private static Integer id = 1;
    private String title;
    private double price;
    private double remaining_number;

    public Ticket(String title, double price, double remaining_number) {
        Ticket.id++;
        this.title = title;
        this.price = price;
        this.remaining_number = remaining_number;
    }

    public static Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", remaining_number=" + remaining_number +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRemaining_number() {
        return remaining_number;
    }

    public void setRemaining_number(double remaining_number) {
        this.remaining_number = remaining_number;
    }
}
