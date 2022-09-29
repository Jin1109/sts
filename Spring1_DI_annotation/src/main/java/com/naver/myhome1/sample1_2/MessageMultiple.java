/*
 * @Autowired사용해 보기
    -@Autowired은 생성자나 메서드, 멤버변수 위에 모두 사용할 수 있습니다.
    -자동 주입 기능을 사용하면 스프링 컨테이너는 알아서 의존 객체를 찾아서 주입해 줍니다.
    -즉, 해당 타입에 할당할 수 있는 빈 객체를 찾아서 주입합니다.
    -@Autowired 애노테이션을 적용하면 반드시 주입할 의존 객체가 존재해야 합니다.
    -만약 -@Autowired가 붙은 객체가 메모리에 없다면 스프링 컨테이너가
    NoSuchBeanDefinitionException을 발생시킵니다.
    
    자동 주입 기능을 위한 두 가지 사용
    1) 자동 주입 대상에 @Autowired 애노테이션 사용
    2) XML 설정에 <context:annotation-config/> 사용
 */
package com.naver.myhome1.sample1_2;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageMultiple {
	
	//해당 타입에 할당할 수 있는 빈 객체를 찾아서 자동 주입됩니다.
	//반드시 주입할 의존 객체가 존재해야 합니다.
	//기존에 의존성 주입에 사용했던 setter메소드나 생성자는 필요 없습니다.
	@Autowired
	private MessageBean messagebean;
	
	public MessageMultiple() {
		System.out.println("MessageMultiple 생성자입니다.");
	}
	
	public void print() {
		messagebean.sayHello("Spring");
	}
	
	
}
