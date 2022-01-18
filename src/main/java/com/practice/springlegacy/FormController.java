package com.practice.springlegacy;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	
	@RequestMapping("/form/servletRequest")
	public String loginMember(HttpServletRequest req, Model model) {
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		model.addAttribute("message", "로그인 정보가 전달됐습니다.");
		
		return "01Form/servletRequest";
	}
}