/* @Qualifier("m1") 생략한 경우 오류 발생
 
 
 * @Autowired annotation을 이용해서 객체를 주입합니다.
 * @Qualifier annotation을 이용해서 주입될 객체의 아이디나 이름을 지정할 수 있습니다.
 * 
 * @Autowired와 @Qualifier을 한 번에 처리할 수 있는 것이 @Resource입니다.
 */
/*
   1. @Resource 사용해 보기
      -@Autowired는 변수의 타입을 기준으로 검색하여 의존성 주입을 처리하지만
       @Resource는 객체의 이름을 이용하여 의존성 주입을 처리합니다.
       -생성자에는 적용할 수 없고 필드나 메서드에만 적용할 수 있습니다.
       
       		자동 주입 기능을 위한 두 가지 사용
       1) 자동 주입 대상에 @Resource 애노테이션 사용
       2) XML 설정에 <context:annotation-config/> 사용
 */
package com.naver.myhome1.sample4;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class MessageMultiple {

	@Resource(name="m")
	private MessageBean messagebean;
	
	public MessageMultiple() {
		System.out.println("MessageMultiple 생성자입니다.");
	}
	
	public void print() {
		messagebean.sayHello("Spring");
	}
	
	
}
