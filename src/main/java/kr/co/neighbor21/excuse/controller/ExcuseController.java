package kr.co.neighbor21.excuse.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ExcuseController {
	
	@GetMapping("/home")//main 브랜치 테스트4444
	public String home(Model model, HttpSession session) throws Exception {

		
		return "excuse/excuse_home";
	}
	
}