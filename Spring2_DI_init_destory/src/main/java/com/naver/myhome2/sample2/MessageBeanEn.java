package com.naver.myhome2.sample2;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("m")
public class MessageBeanEn implements MessageBean{

	// 추상메서드 오버라이딩
	@Override
	public void sayHello(String name) {
		System.out.println("Hello!" + name);
	}
	
	public MessageBeanEn() {
		System.out.println("이곳은 MessageBeanEn 생성자입니다.");
	}
	
	@PreDestroy //destory-method="destoryMethod"에 해당하는 annotation
	public void destroyMethod() {
		System.out.println("MessageBeanEn의 destroyMethod()입니다.");
	}
	
	
}
