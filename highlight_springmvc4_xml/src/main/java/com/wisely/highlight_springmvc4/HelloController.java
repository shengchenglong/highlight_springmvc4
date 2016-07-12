package com.wisely.highlight_springmvc4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	public HelloController() {
		System.out.println("init ................");
	}
	
	@RequestMapping("/index")
	public String hello() {
		return "index";
	}
}
