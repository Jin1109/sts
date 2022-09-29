package com.naver.myhome2.sample1;

public class MessageBeanEn implements MessageBean{

	// 추상메서드 오버라이딩
		@Override
		public void sayHello(String name) {
			System.out.println("Hello!" + name);
		}
	
	public MessageBeanEn() {
		System.out.println("이곳은 MessageBeanEn 생성자입니다.");
	}
	
	/*스프링 컨테이너가 객체를 삭제하기 직전에 호출될 메서드입니다.*/
	public void destroyMethod() {
		System.out.println("MessageBeanEn의 destroyMethod()입니다.");
	}
	
	
}
