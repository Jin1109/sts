package com.naver.myhome1.sample5;

import java.io.IOException;

public class MessageBeanImpl implements MessageBean {
	private String name;
	private String greeting;
	private Outputter outputter;
	
	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
		System.out.println("MessageBeanImpl의 setOutputter()에서 값 저장");
	}// setter DI 설정
	
	public MessageBeanImpl(String name) {
		this.name = name;
		System.out.println("MessageBeanImpl 생성자 입니다.");
	}
	
	@Override
	public void sayHello() {
		String message = greeting + name + "!";
		System.out.println("MessgaeBeanImpl의 sayHello() 호출 : " + message);
		try {
			outputter.output(message);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("MessageBeanImpl의 setGreeting()에서 값 저장");
	}

}
