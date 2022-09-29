package com.naver.myhome5.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AroundAdvice2 {
	private static final Logger logger = LoggerFactory.getLogger(AroundAdvice2.class);
	
	public Object aroundLog(ProceedingJoinPoint proceeding) throws Throwable {
		
		//=================대상 객체 메서드 호출 전 수행할 공통기능 작성하는 곳
		
		
		
		
		// 이 코드의 이전과 이후에 공통 기능을 위한 고드를 위치 시키면 됩니다.
		// 대상 객체의 메서드 (예-BoardServiceImpl.getListCount()) 를 호출합니다.
		Object result = proceeding.proceed();
		
		
		
		//================대상 객체 메서드 호출 후 수행할 공통기능 작성하는 곳
		return result;
	}
}
