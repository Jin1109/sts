//Set Ÿ�� ����
package com.naver.myhome1.sample7;

import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp_Set {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("com/naver/myhome1/sample7/applicationContext.xml");
		
		CollectionBean bean = 	(CollectionBean) ctx.getBean("collectionBean");
		
		Set<String> addressList = bean.getAddressList();
		
		//Set �÷����� ���� �����͸� �ߺ��ؼ� �������� �ʽ��ϴ�.
		for(String address : addressList)
			System.out.println(address);
		
		ctx.close();
	}
}
