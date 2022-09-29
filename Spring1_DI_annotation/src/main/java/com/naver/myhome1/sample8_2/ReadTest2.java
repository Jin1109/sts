package com.naver.myhome1.sample8_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadTest2 {
	
	@Value("${name}")
	private String readname;
	
	@Value("${age}")
	private String age;
	
	public void print() {
		System.out.println(readname);
		System.out.println(age);
	}
}
