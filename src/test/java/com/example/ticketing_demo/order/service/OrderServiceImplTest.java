package com.example.ticketing_demo.order.service;

import com.example.ticketing_demo.config.AppConfig;
import com.example.ticketing_demo.helper.SpringHelper;
import com.example.ticketing_demo.order.model.Order;
import com.example.ticketing_demo.ticket.model.Ticket;
import com.example.ticketing_demo.user.model.User;
import com.example.ticketing_demo.user.service.UserService;
import com.example.ticketing_demo.helper.TicketHelper;
import com.example.ticketing_demo.helper.UserHelper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;

class OrderServiceImplTest {

    static ApplicationContext ac;

//    AppConfig config = new AppConfig();
    static UserService userService;
    static OrderService orderService;

    @BeforeAll
    static void setUp() {
        ac = SpringHelper.getAnnotationContext();
        userService = ac.getBean("userService",UserService.class);
        orderService = ac.getBean(OrderService.class);
    }

    @Test
    @DisplayName("Order test")
    void order() {
        User user = UserHelper.getVIPUser();
        userService.save(user);

        Ticket ticket = TicketHelper.getTicket();

        Order order = orderService.order(user.getId(), ticket);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

    @Test
    @DisplayName("xml ac test")
    void orderXml() {
        ApplicationContext ac2 = SpringHelper.getXmlApplicationContext();
        UserService userService = ac2.getBean("userService", UserService.class);
        OrderService orderService = ac2.getBean(OrderService.class);

        User user = UserHelper.getVIPUser();
        userService.save(user);

        Ticket ticket = TicketHelper.getTicket();
        Order order = orderService.order(user.getId(), ticket);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}