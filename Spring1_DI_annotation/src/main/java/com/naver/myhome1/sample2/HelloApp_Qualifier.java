package com.naver.myhome1.sample2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp_Qualifier {
	public static void main(String[] args) {
		//1. Spring 컨테이너를 구동합니다.
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("com/naver/myhome1/sample2/applicationContext2.xml");
		
		//2. Object getBean(String name) :
		//			argument로 지정된 이름의 bean 인스턴스를 반환합니다.
		// Spring 컨테이너로부터 빈의 아이디가 "m2"인 bean을 가져옵니다.
		MessageMultiple bean = (MessageMultiple)ctx.getBean("m2");
		
		//3. 메서드 실행합니다.
		bean.print();
		
		//4. Spring 컨테이너를 종료합니다.
		ctx.close();
	}

}
