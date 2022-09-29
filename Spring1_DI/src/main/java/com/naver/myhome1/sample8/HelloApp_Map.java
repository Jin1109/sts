//Map 타입 매핑
package com.naver.myhome1.sample8;

import java.util.Map;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp_Map {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("com/naver/myhome1/sample8/applicationContext.xml");
		
		CollectionBean bean = 	(CollectionBean) ctx.getBean("collectionBean");
		
		Map<String, String> addressList = bean.getAddressList();
		
		Set<String> keys = addressList.keySet();
		for(String key: keys) {
			System.out.println(key + ":" + addressList.get(key));
		}
		
		/*
		 System.out.println(addressList.get("주소")):
		 System.out.println(addressList.get("나이")):
		 */
		
		ctx.close();
	}
}
