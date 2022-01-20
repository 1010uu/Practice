package com.practice.springlegacy;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestMappingController {
	
	@RequestMapping("/requestMapping/index.do")
	public String rmIndex() {
		return "02RequestMapping/index";
	}
	
	//get방식 폼값 전송
	@RequestMapping(value="/requestMapping/getSearch.do", method=RequestMethod.GET)
	public String getSearch(HttpServletRequest req, Model model) {
		
		System.out.println("RequestMethod.GET방식으로 폼 값 전송");
		
		String sColumn = req.getParameter("searchColumn");
		String sWord = req.getParameter("searchWord");
		
		model.addAttribute("sColumn", sColumn);
		model.addAttribute("sWord", sWord);
		
		return "02RequestMapping/getSearch";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/requestMapping/postLogin.do")
	public ModelAndView postLogin(
			@RequestParam("user_id") String id, 
			@RequestParam("user_pw") String pw 
			) {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("02RequestMapping/postLogin");
		mv.addObject("id", id);
		mv.addObject("pw", pw);
		
		return mv;
	}
}
