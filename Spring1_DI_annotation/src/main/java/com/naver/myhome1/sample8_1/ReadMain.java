package com.naver.myhome1.sample8_1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ReadMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("com/naver/myhome1/sample8_1/applicationContext1.xml");
		
		ReadTest1 rt = (ReadTest1)ctx.getBean("readTest1");
		rt.print();
		
		ctx.close();
	}
}
