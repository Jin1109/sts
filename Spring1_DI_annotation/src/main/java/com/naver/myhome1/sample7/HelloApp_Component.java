//출력 메시지를 콘솔이 아닌 다른 파일에도 기능이 추가되게 해 보겠습니다.
package com.naver.myhome1.sample7;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp_Component {
	public static void main(String[] args) {

		GenericXmlApplicationContext ctx
		 = new GenericXmlApplicationContext(
				 "com/naver/myhome1/sample7/applicationContext7.xml");
		MessageBeanImpl m3 = (MessageBeanImpl) ctx.getBean("m3");
		m3.setGreeting("안녕하세요?");
		
		FileOutputter out = (FileOutputter)ctx.getBean("fileOutputter");
		out.setFilePath("out7.txt");
		
		//메서드 호출합니다.
		m3.sayHello();
		ctx.close();
			}
}
