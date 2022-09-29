package com.naver.myhome5.app;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//공통으로 처리할 로직을 LogAdvice 클래스에 beforeLog()메서드로 구현합니다.
@Component
public class LogAdvice {
	
	private static final Logger logger = LoggerFactory.getLogger(LogAdvice.class);
	
	//LogAdvice 클래스의 공통 메서드를 aop에서 Advice라고 합니다.
	public void beforeLog(){
		logger.info("[LogAdvice : 공통메서드 입니다.]");
	}
}
