package com.chapter02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	//스프링부트는 @ComponentScan을 먼저 처리하여 사용자가 등록한 빈을 먼저 메모리에 올린다. 그리고 나중에 @EnableAutoConfiguration을 실행하여 자동설정에 의한 빈 등록을 처리한다, 따라서 우리가 생성한 빈을 자동설정으로 생성한 빈이 덮어 써버린 것이다.
public class Chapter02Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter02Application.class, args);
	}

}
