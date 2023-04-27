package com.chapter02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import com.himedia.jdbc.util.JDBCConnectionManager; //직접 만든거 임포트해왔음

@Service	//컨테이너가 컴포넌트 스캔하도록 @Service를 추가
public class JDBCConnectionManagerRunner implements ApplicationRunner {
	@Autowired
	private JDBCConnectionManager connectionManager;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("커넥션 매니저 : " + connectionManager.toString());	
	}
}
