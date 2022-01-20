package com.practice.springlegacy;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import common.MemberDTO;

//DispatcherServlet은 기본패키지로 지정된 곳에서 Controller를 찾아냄

@Controller
public class FormController {
	
	//폼값 1
	//요청명을 통해 로직을 수행
	@RequestMapping("/form/servletRequest")
	public String loginMember(HttpServletRequest req, Model model) {
		
		//파라미터로 값을 받아와서
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		//model에 저장해주고
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		model.addAttribute("message", "로그인 정보가 전달됐습니다.");
		
		//뷰로 리턴
		return "01Form/servletRequest";
	}
	
	//폼값2
	@RequestMapping("/form/requestParam.do")
	public String joinMember(Model model,
			@RequestParam("name") String name,
			@RequestParam("id") String id,
			@RequestParam("pw") String pw,
			@RequestParam("email") String email) {
		
		//MemberDTO 객체 생성
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setName(name);
		memberDTO.setId(id);
		memberDTO.setPw(pw);
		memberDTO.setEmail(email);
		
		//id,pw,email,name등을 set한 memberDTO를 model에 저장하고
		model.addAttribute("memberDTO", memberDTO);
		
		//뷰를 호출한다
		return "01Form/requestParam";
	}
	
	//폼값3
	@RequestMapping("/form/commandObjGet.do")
	public String commandObjGet(MemberDTO memberDTO) {
		
		return"01Form/commandObjGet";
	}
	
	//폼값4
	@RequestMapping("/form/{memberId}/{memberName}")
	public String pathVariable(Model model,
			 @PathVariable String memberId,
			 @PathVariable String memberName) {
		
		model.addAttribute("memberId", memberId);
		model.addAttribute("memberName", memberName);
		
		return "01Form/pathVariable";
	}
}
