//Set 타입 매핑
package com.naver.myhome1.sample7;

import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp_Set {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("com/naver/myhome1/sample7/applicationContext.xml");
		
		CollectionBean bean = 	(CollectionBean) ctx.getBean("collectionBean");
		
		Set<String> addressList = bean.getAddressList();
		
		//Set 컬렉션은 같은 데이터를 중복해서 저장하지 않습니다.
		for(String address : addressList)
			System.out.println(address);
		
		ctx.close();
	}
}
