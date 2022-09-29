package com.naver.myhome1.sample1_1;

public class HelloApp_java {
	public static void main(String[] args) {
		MessageBean m = new MessageBeanEn();
		MessageMultiple m2 = new MessageMultiple();
		m2.setBean(m);
		m2.print();
	}
}
