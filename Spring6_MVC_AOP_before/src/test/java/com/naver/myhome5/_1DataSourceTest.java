package com.naver.myhome5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * <!-- Test -->
 		<dependency>
  			<groupID>junit</groupId>
  			<artifactId>junit</articfactId>
  			<version>4.12</version>
  			<scope>test<scope>
  		</dependency>
  
 * 		<!-- junit 사용을 위해 추가합니다. -->
  		<dependency>
  			<groupID>org.springframework</groupId>
  			<artifactId>spring.test</articfactId>
  			<version>${org.springframwork-version}</version>
  		</dependency>
  
 *  -- Junit이란?
   
1. Junit이란 Java에서 독립된 단위테스트를 지원해주는 프레임워크입니다.

2. Test Runner는 Junit 프레임워크에서 테스트 클래스 내에 존재하는 각각의 테스트 메서드 실행을 담당하고 있는 클래스입니다.
   Junit에 내장된 기본 Test Runner은 BlockJunit4ClassRunner 입니다.
   
3. @RunWith는 Junit 프레임워크의 테스트 실행방법을 확장할 때 사용하는 애노테이션입니다.
   @RunWith에 Runner클래스를 설정하면 Junit에 내장된 Runner대신 그 클래스를 실행합니다.
   여기서는 스프링 테스트를 위해서 SpringJunit4ClassRunner라는 Runner 클래스를 설정해 줍니다.
   
4. @RunWith(SpringJUnit4ClassRunner.class)
   SpringJunit4ClassRunner라는 Junit용 테스트 컨텍스트 프레임워크 확장 클래슬ㄹ 지정해 주면 Junit이 
   테스트를 진행하는 중에 테스트가 사용할 애플리케이션 컨텍스트를 만들고 관리하는 작업을 지행해 줍니다.
   
5. @ContextConfiguartion은 자동으로 만들어줄 애플리케이션 컨텍스트의 설정파일의 위치를 지정할 때 사용합니다.
   @ContextConfiguartion(Locations={"file:src/main/webapp/WEB-INF/Spring/root-context.xml"})
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class _1DataSourceTest {
	/*
	 1. 먼저 org.slf4j 패키지의 Logger, Logger, LoggerFactory 클래스를 import 합니다.
	 	import org.slf4j.Logger;
	 	import org.slf4j.LoggerFactory;
	 2. LoggerFactory 클래스의 getLogger 메소드를 통해 Logger 객체를 생성합니다.
	 	
	 	*/
	private static final Logger logger = LoggerFactory.getLogger(_1DataSourceTest.class);
	
	@Autowired
	private DataSource dataSource;//root-context.xml 에 설정된 DataSource를 자동으로 주입해줍니다.
	
	@Test //현재 메서드를 테스트 대상으로 지정하는 애노테이션입니다.(org.junit.Test)
	public void testConnection() {
		try(Connection conn = dataSource.getConnection()) {
			logger.info("확인용 conn : " + conn);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testQuery() {
		try(Connection conn = dataSource.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(
					"select to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss') from dual");
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			logger.info("현재시각 : "+rs.getString(1));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
