package com.naver.myhome1.sample7;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//getBean을 호출할 때 이 이름을 사용합니다.
@Component("m3")
public class MessageBeanImpl implements MessageBean{
	private String name;
	private String greeting;
	
	private Outputter outputter;
	
	
	//변경부분
	public MessageBeanImpl() {
		name = "홍길동";
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
	
	//추가된 부분 
	@Autowired//해당 타입에 할당할 수 있는 빈 객체를 창장서 자동 주입됩니다.
			  //반드시 주입할 의존 객체가 존재해야 합니다.
	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
		System.out.println("MessageBeanImpl의 setOutputter()에서 값 저장");
	}// property DI 설정

}
