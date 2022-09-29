package com.naver.myhome1.sample8_2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ReadMain2 {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("com/naver/myhome1/sample8_2/applicationContext2.xml");
		
		ReadTest2 rt = (ReadTest2)ctx.getBean("readTest2");
		rt.print();
		
		ctx.close();
	}
}
