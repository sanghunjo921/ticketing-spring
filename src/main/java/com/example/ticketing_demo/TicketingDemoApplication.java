package com.example.ticketing_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketingDemoApplication {

	//applicationcontext가 스프링의 config를 관리 - 이걸 호출
	public static void main(String[] args) {
		SpringApplication.run(TicketingDemoApplication.class, args);



	}

}
