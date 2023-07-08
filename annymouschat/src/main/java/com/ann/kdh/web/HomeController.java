package com.ann.kdh.web;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import groovy.util.logging.Slf4j;

@Controller
@Slf4j
public class HomeController {

	@GetMapping("/")
	public String index(Model model) {
		
		// index 페이지로 이동
		model.addAttribute("now", LocalDateTime.now());
		
		return "/main/index";
	}
	
}
