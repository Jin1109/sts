package com.naver.myhome1.sample2_1;

public class MessageBeanKo implements MessageBean {
	// 추상메서드 오버라이딩
	@Override
	public void sayHello(String name) {
		System.out.println("안녕하세요!" + name);
	}
}
