package com.example.ticketing_demo.helper;

import com.example.ticketing_demo.ticket.model.Ticket;
import com.example.ticketing_demo.user.model.Level;
import com.example.ticketing_demo.user.model.User;

import java.util.List;

public class TicketHelper {
    public static Ticket getTicket() {
        return new Ticket("Ticket 1", 100000, 50);
    }
}
