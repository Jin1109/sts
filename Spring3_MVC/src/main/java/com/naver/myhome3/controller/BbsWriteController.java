package com.naver.myhome3.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.naver.myhome3.model.BbsBean;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/*
  Controller 종류
     1. Controller(interface)
     2. AbstractController
     3. AbstractCommandController
     4. MultiActionController
           위의 interface/class를 상속하여 Controller를 작성합니다.
           
        가장 기본이 되는 Controller 작성 합니다.
     AbstractController를 상속 받고 오버라이딩 해서 코드를 구현합니다.
 */
public class BbsWriteController extends AbstractController {
   
   private BbsBean b;
   public void setBbsBean(BbsBean b) {
      this.b = b;
   }
   
   //ModelAndView:Controller 처리 결과 후 응답할 View와 View에 전달할 값을 저장합니다.
   @Override
   protected ModelAndView handleRequestInternal(
         HttpServletRequest request,
         HttpServletResponse response) throws Exception{
      
      //web.xml의 필터 설정으로 아래 문장은 더이상 필요 없습니다.
      //request.setCharacterEncoding("utf-8");
      
      String id=request.getParameter("id").trim();
      String pass=request.getParameter("pass").trim();
      
      b.setId(id); b.setPass(pass);
      
      ModelAndView mv = new ModelAndView();
      mv.setViewName("list");
      //두 문장과 같은 의미 : ModelAndView mv = new ModelAndView("list");
      //ViewResolver에 의해 webapp/view/list.jsp를 찾아가게 됩니다.
      
      mv.addObject("bkey", b);
      //addObject의 첫 번째 매개변수는 키(key), 두 번째 매개변수는 값(value)을 의미합니다.
      //b는 id와 비밀번호가 저장되어 있는 DTO 객체 입니다.
      //ModelAndView에 값을 저장한 것은 webapp/view/list.jsp에 EL로 나타낼 수 있습니다.
      //Id : ${bkey.id} <br>
      //비밀번호 : ${bkey.pass} <br>
      
      return mv;
   }

}