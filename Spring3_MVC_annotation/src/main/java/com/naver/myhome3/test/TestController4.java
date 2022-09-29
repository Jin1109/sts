package com.naver.myhome3.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naver.myhome3.model.Join;

@Controller
public class TestController4 {

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "test/join";
	}
	
	@RequestMapping(value = "/joinProcess", method = RequestMethod.POST)
	public String joinProcess(Join join) {
		return "test/send";
	}
	
	@RequestMapping(value = "joinProcess")
	public String check(String[] hobby, Model mv) {
		String result = hobby[0];
		for (int i = 1; i < hobby.length; i++) {
			result += "," + hobby[i];
		}
		
		System.out.println(result);
		
		mv.addAttribute("hobby", result);
		return "check/check";
	}
}
