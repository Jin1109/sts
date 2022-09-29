/* @Qualifier("m1") 생략한 경우 오류 발생
 
   Error creating bean with name 'm2' : Unsatisfied dependency expressed through field 'messagebean';
   nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
   No qualifying bean of type 'com.naver.myhome1.sample2.MessageBean'
   available: expected single matching bean but found 2: m,m1
   
 * MessageBean 타입의 빈이 "m"과 "m1" 두 개가 존재해서 어떤 객체를 주입할지 모르기 때문에 발생하는 예외입니다.
 * 
 * @Qualifier annotation을 이용해서 주입될 객체의 아이디나 이름을 지정할 수 있습니다.
  
 * @Autowired와 @Qualifier을 한 번에 처리할 수 있는 것이 @Resource입니다.
 */
package com.naver.myhome1.sample2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageMultiple {
	
	//해당 타입에 할당할 수 있는 빈 객체를 찾아서 자동 주입됩니다.
	//반드시 주입할 의존 객체가 존재해야 합니다.
	//기존에 의존성 주입에 사용했던 setter메소드나 생성자는 필요 없습니다.
	@Autowired
	@Qualifier("m")
	private MessageBean messagebean;
	
	public MessageMultiple() {
		System.out.println("MessageMultiple 생성자입니다.");
	}
	
	public void print() {
		messagebean.sayHello("Spring");
	}
	
	
}
