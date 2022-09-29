package com.naver.myhome2.sample1;

public class MessageMultiple {

	private MessageBean messagebean;
	public void setBean(MessageBean messagebean) {
		this.messagebean = messagebean;
	}
	
	public MessageMultiple() {
		System.out.println("MessageMultiple 생성자입니다.");
	}
	
	public void print() {
		messagebean.sayHello("Spring");
	}
	
	//객체를 생성한 후에 init-method 속성으로 지정된 이 메서드를 호출합니다.
	public void initMethod() {
		System.out.println("MessageMultiple의 initMethod()를 실행합니다.");
	}
	
	
}
