package com.example.ticketing_demo.order.service;

import com.example.ticketing_demo.order.model.Order;
import com.example.ticketing_demo.ticket.model.Ticket;
import com.example.ticketing_demo.user.model.User;
import com.example.ticketing_demo.user.service.UserService;

// static은 build할때 올라가서 메모리에 eager loading -> 따라서 static에서 바로 new로 만들어주면 자주 안써도 메모리에 올라가기 때문에 성능 이슈
public class OrderServiceSingletonImpl implements OrderService{
    private UserService userService;
    private DiscountPolicy discountPolicy;
    private static OrderServiceSingletonImpl INSTANCE;

    static {
        // instance related code
    }

    public OrderServiceSingletonImpl(UserService userService, DiscountPolicy discountPolicy) {
        this.userService = userService;
        this.discountPolicy = discountPolicy;
    }

    public OrderServiceSingletonImpl() {}

    public static OrderServiceSingletonImpl getInstance() {
//        if (INSTANCE ==null) {
//            synchronized (OrderServiceSingletonImpl.class)  {
//                if (INSTANCE ==null) {
//                    INSTANCE = new OrderServiceSingletonImpl();
//                }
//            }
//        }
//        return INSTANCE;
        return Holder.INSTANCE;
    }

    // holder에서 instance 호출할때 메모리에 올라가서 lazy loading
    private static class Holder {
        private static final OrderServiceSingletonImpl INSTANCE = new OrderServiceSingletonImpl();
    }

    @Override
    public Order order(Integer userId, Ticket ticket) {
        User user = userService.findById(userId);
        double discountPrice = discountPolicy.discount(user, ticket);

        return new Order(userId, ticket, discountPrice);
    }

    public static void main(String[] args) {
        OrderServiceSingletonImpl service1 = OrderServiceSingletonImpl.getInstance();
        OrderServiceSingletonImpl service2 = OrderServiceSingletonImpl.getInstance();
    }
}
