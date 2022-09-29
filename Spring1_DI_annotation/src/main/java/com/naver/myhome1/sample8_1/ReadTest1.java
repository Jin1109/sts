package com.naver.myhome1.sample8_1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadTest1 {
	
	@Value("이곳의 문자열이 아래의 변수에 주입되어 사용할 수 있습니다.")
	private String readtest;
	
	public void print() {
		System.out.println(readtest);
	}
}
