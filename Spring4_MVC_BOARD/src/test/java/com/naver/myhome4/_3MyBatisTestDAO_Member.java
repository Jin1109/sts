package com.naver.myhome4;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.naver.myhome4.domain.Member;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class _3MyBatisTestDAO_Member {

   private static final Logger logger = LoggerFactory.getLogger(_3MyBatisTestDAO_Member.class);
   
   @Autowired
   private SqlSessionTemplate sqlsession;
   
   @Test
   public void searchCount() {
      Map<String, String> map = new HashMap<String, String>();
      map.put("search_field", "name"); // name 검색
      map.put("search_word", "%홍길동%"); // 홍길동 포함
      int count = sqlsession.selectOne("Members.searchCount", map);
      logger.info("==========" + count + "명 ==========");
   }
   
   @Test
   public void searchList() {
      Map<String, Object> map = new HashMap<String, Object>();
      map.put("start", 1);
      map.put("end", 3);
      map.put("search_field", "name");
      map.put("search_word", "%홍길동%");
      List<Member> results = sqlsession.selectList("Members.getSearchList", map);
      logger.info("==================== readAll() 시작 ====================");
	      for (Member result : results) {
	      logger.info("아이디:" + result.getId());
	      logger.info("비밀번호:" + result.getPassword());
	      logger.info("나이:" + result.getAge());
	      logger.info("이름:" + result.getName());
	      logger.info("이메일:" + result.getEmail());
	      logger.info("성별:" + result.getGender());
	      logger.info("========================================");
      }
   }
}