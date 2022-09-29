package com.naver.myhome3.Json;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {

	// 반환형이 스트링이면 이동할 페이지를 의미합니다.
	@RequestMapping(value = "/url")
	public String first1() throws Exception {
		return "json/url1";
	}
	
	// @ResponseBody르 이용해서 이동할 페이지가 아닌 문자열을 응답으로 보냅니다.
	@ResponseBody
	@RequestMapping(value = "/url2")
	public String first2() {
		return "json/url2";
	}
	
	@RequestMapping(value = "/url3")
	   public void first3(HttpServletResponse response) throws Exception {
	      response.getWriter().print("json/url3");
	}
}
