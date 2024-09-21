package com.example.ticketing_demo.config;

import com.example.ticketing_demo.order.service.DiscountPolicy;
import com.example.ticketing_demo.order.service.FixedDiscountPolicy;
import com.example.ticketing_demo.order.service.OrderService;
import com.example.ticketing_demo.order.service.OrderServiceImpl;
import com.example.ticketing_demo.user.repo.MemUserRepository;
import com.example.ticketing_demo.user.repo.UserRepository;
import com.example.ticketing_demo.user.service.UserService;
import com.example.ticketing_demo.user.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

// componentscan options: white list 전체 블락 후 몇개허용/block list 전체 허용후 몇개 블락
// exclude: blocklist
// include: white
// annotation도 클래스
// componnet가 붙은 얘들만 스캔함 ex) user/repo/memuserrepository/@component
// 디폴트로 서브 패키지만 찾아서 config밑에 있는 애뜰만 찾는데 나머지가 싹다 config위에 있어서 base part를 바꿔야함
@Configuration
@ComponentScan(
//        basePackages = {"com.example.ticketing_demo.order", "com.example.ticketing_demo.user"},
        basePackages = "com.example.ticketing_demo",
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AppAutoConfig {
    @Bean
    public UserService user2Service() {
        return new UserServiceImpl(new MemUserRepository());
    }
}
