/*
 *  @Component 사용해 보기
 *  - Spring 컨테이너가 component-scan에 의해서 자동으로 bean 등록할 대상으로 지정됩니다.
 *  - 이때 bean의 이름을 지어줄 수 있는데 방법은 @Component("빈의 이름")하면 됩니다.
 *  - 이름을 사용하지 않으면 지정한 클래스의 이름에서 첫글자를 소문자로 바꾼 이름으로 bean이 생성됩니다.
 *    예)
 *    @Component
 *    public class MessageMultiple {}인 경우
 *    
 *    MessageMultiple bean = (MessageMulitple)ctx.getBean("messageMultiple");
 */
package com.naver.myhome1.sample4;

import org.springframework.context.support.GenericXmlApplicationContext;
public class HelloApp_Component {
	public static void main(String[] args) {
		//1. Spring 컨테이너를 구동합니다.
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("com/naver/myhome1/sample4/applicationContext4.xml");
		
		//2. Spring 컨테이너로부터 빈의 아이다가 "messageMultiple"인 bean을 가져옵니다.
		//MessageMultiple bean	= (MessageMulitple)ctx.getBean("messageMultiple');
		//messageMulitple bean	= ctx.getBean(MessageMulitple.class);
		MessageMultiple bean = ctx.getBean("messageMulitple",MessageMultiple.class);
		
		//3. 메서드 실행합니다.
		bean.print();
		
		//4. Spring 컨테이너를 종료합니다.
		ctx.close();
	}

}
