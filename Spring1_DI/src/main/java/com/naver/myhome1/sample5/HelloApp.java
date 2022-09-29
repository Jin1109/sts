//출력 메시지르 콘솔이 아닌 다른 파일에도 기능이 추가되게 해 보겠습니다.
package com.naver.myhome1.sample5;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp{
	public static void main(String[] args) {

		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext(
				"com/naver/myhome1/sample5/applicationContext.xml");
		
		System.out.println("================getBean() 전 ======================");
		// Object getBean(String name) :
		// argument로 지정된 이름의 bean 인스턴스를 반환합니다.
		// applicationContext.xml에서 id가 "m3"인 bean을 가져옵니다.
		MessageBean bean = (MessageBean) ctx.getBean("m3");
		
		bean.sayHello();//메서드 호출합니다.
		
		ctx.close();
		
		//자동 새로 고침
		//windows > Preferences > General
		//		  > Workspace > Refresh using native hooks and polling 
		
    }
}
