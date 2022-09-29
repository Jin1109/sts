package com.naver.myhome1.sample6;

import java.io.IOException;

import javax.annotation.Resource;

public class MessageBeanImpl implements MessageBean{
	private String name;
	private String greeting;
	private Outputter outputter;
	
	
	//변경 부분
	public MessageBeanImpl(String name) {
		this.name = name;
		System.out.println("MessageBeanImpl 생성자 입니다.");
	}
	
	@Override
	public void sayHello() {
		String message = greeting + name + "!";
		System.out.println("MessageBeanImpl의 sayHello() 호출 : " + message);
		try {
			outputter.output(message);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("MessageBeanImpl의 setGreeting()에서 값 저장");
	}// setter DI 설정
	
	//추가된 부분 - name 속성에 주입하고자 하는 의존 객체의 이름(아이디 값)을 지정합니다.
	//@Resource - Outputter 자료형이 한 개인 경우 (name="outputter") 생략 가능합니다.
	@Resource(name="outputter")
	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
		System.out.println("MessageBeanImpl의 setOutputter()에서 값 저장");
	}// property DI 설정

}
