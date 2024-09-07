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
import org.springframework.context.annotation.Configuration;

// Bean: spring이 관리하는 java class. dependency injection을 해줘야 하면 스프링이 관리하는 클래스여야 하는데 스프링이 관리하는 클래스가 빈
// java는 소스코드고 build하면 짠 얘들이 build dir에 생김. 빌드한 얘들은 바이너리로 바뀐거고 이 안에 컨트롤러들은 다 클래스. ide가 decompile해서 다 보여주는데 이 빌드된 클래스 파일을 오버라이딩 할 수 있음
// 클래스 파일들은 바이트 코드라고도 불림
// bean으로 app config에 등록했는데, 이런 얘들을 무조건 등록한다고 다 등록되지 않기 때문에 어떤식으로 스캔되는지 공부
// 실제 enterprise에 클래스가 수 많은데 다 수동 등록보다 자동 등록하게 됨 (우선순위는 수동)
@Configuration
public class AppConfig {
    @Bean
    public UserRepository userRepository() {
        return new MemUserRepository();
    }

    @Bean
    public UserService userService() {
        return new UserServiceImpl(userRepository());
    }

    @Bean
    public UserService user2Service() {
        return new UserServiceImpl(userRepository());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new FixedDiscountPolicy();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(userService(), discountPolicy());
    }
}

// 싱글톤: 스레드환경에서 싱크로나이즈 관리하는 바업ㅂ
//
