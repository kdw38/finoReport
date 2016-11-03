package com.finotek.dailyReport;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public @ResponseBody String hello() {
		return "Hello, Spring Boot!";
	}
}