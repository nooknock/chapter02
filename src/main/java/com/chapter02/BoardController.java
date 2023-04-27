package com.chapter02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController는 JSP 같은 뷰를 별도로 만들지 않는 대신에 컨틀로러 메소드가 리턴한 데이터 자체를 클라이언트로 전달
@RestController	//@Controller 대신 스프링 4부터 지원하는 @RestController를 사용, RestController를 사용하면 REST 방식의 응답을 처리하는 컨트롤러를 구현할 수 있다.
public class BoardController {

	public BoardController() {
		System.out.println("===> BoardController 생성");
	}
	
	@GetMapping("/hello")
	String hello(String name) {
		return "Hello "+name;
	}
}