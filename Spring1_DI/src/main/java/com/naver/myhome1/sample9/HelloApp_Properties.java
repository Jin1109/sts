//Properties 타입 매핑
package com.naver.myhome1.sample9;

import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp_Properties {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("com/naver/myhome1/sample9/applicationContext.xml");
		
		CollectionBean bean = 	(CollectionBean) ctx.getBean("collectionBean");
		Properties addressList = bean.getAddressList();
		
		System.out.println(addressList.getProperty("주소"));
		System.out.println(addressList.getProperty("나이"));
		
		//Properties에서 사용된 키값들을 가져옵니다.
		Set<String> keys = addressList.stringPropertyNames();
		for(String key: keys) {
			System.out.println(key + ":" + addressList.getProperty(key));
		}
		
		ctx.close();
	}
}
