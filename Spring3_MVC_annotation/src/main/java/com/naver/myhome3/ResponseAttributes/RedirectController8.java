package com.naver.myhome3.ResponseAttributes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController8 {
   /*
    * http://localhost:8088/myhome3/first 실행 후
     => http://localhost:8088/myhome3/go?attr=addAttribute
        addFlashAttribute로 보낸 데이터 출력하는 방법 : ${flash}=addFlashAttribute
        addAttribute로 보낸 데이터 출력하는 방법 : ${param.attr}=addAttribute
     => 새로고침
         addFlashAttribute로 보낸 데이터 출력하는 방법 : ${flash}=
         addAttribute로 보낸 데이터 출력하는 방법 : ${param.attr}=addAttribute
         
         addFlashAttribute()는 일회성으로 데이터를 전달합니다.
    */
   @RequestMapping(value="/first")
   public String first(RedirectAttributes rattr) {
      rattr.addFlashAttribute("flash", "addFlashAttribute");
      rattr.addAttribute("attr", "addAttribute");
      return "redirect:/go"; //redirect로 이동해라
                        //http://localhost:8088/myhome3/go
   }
   
   
   @RequestMapping(value="/go")
   public String redirect() {
	   return "redirect2/go"; //뷰페이지 정보
   }
}