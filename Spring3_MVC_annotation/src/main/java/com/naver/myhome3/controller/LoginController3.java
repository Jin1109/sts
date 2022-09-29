package com.naver.myhome3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naver.myhome3.model.BbsBean;

@Controller
public class LoginController3{

	/* command 객체에 접을할 때 사용할 속성 명을 변경하고 싶다면 @ModelAttribute를 사용합니다.
	   예) @ModelAttribute("hoho") BbsBean bbs
	       view 페이지에서 "hoho"라는 이름으로 사용하면 됩니다.
	       
	       <th>ID</th><td><${hoho.id}</td>
	 */
	@RequestMapping(value="/login_ok3.do", method = RequestMethod.POST)
	public String login2_ok3(@ModelAttribute("hoho") BbsBean bbs) {
		return "login/list3";
	}
	
	@RequestMapping(value="/login3", method=RequestMethod.GET)
	public String login3() {
		return "login/loginForm3";
	}


}
