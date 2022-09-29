package com.naver.myhome3.RequestParm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CheckController {
	
	@RequestMapping(value = "check.do")
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
