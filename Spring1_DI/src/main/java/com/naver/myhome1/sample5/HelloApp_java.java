//출력 메시지르 콘솔이 아닌 다른 파일에도 기능이 추가되게 해 보겠습니다.
package com.naver.myhome1.sample5;


public class HelloApp_java{
	public static void main(String[] args) {
		//MessageBeanImpl 객체 생성//생성자 매개변수 값 = "Spring"
		//FileOutputter 객체 생성
		//FileOutputter 객체의 setFilePath() 호출//설정한 값 - "out.txt"
		//MessageBeanImpl 객체의 setGreeting() 호출//설정할 값 - "안녕하세요!"
		//MessageBeanImpl 객체의 setOutputter() 호출//설정할 객체 - FileOutputter 객체
		//MessageBeanImpl 객체의 setHello() 호출
		
		//자동 새로 고침
		//windows > Preferences > General
		//		  > Workspace > Refresh using native hooks and polling 체크하세요
		
		MessageBeanImpl bean = new MessageBeanImpl("Spring");
		FileOutputter outputter = new FileOutputter();
		outputter.setFilePath("out.txt");
		bean.setGreeting("안녕하세요!");
		bean.setOutputter(outputter);
		bean.sayHello();
		
//		GenericXmlApplicationContext ctx
//		 = new GenericXmlApplicationContext("com/naver/myhome1/sample4/applicationContext.xml");
//		MessageBean bean = (MessageBean) ctx.getBean("m2");
//		bean.sayHello();
//		ctx.close();
    }
}
