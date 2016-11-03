package com.finotek.dailyReport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.finotek.dailyReport.service.HelloWorldService;

@RestController
public class HelloWorldController {

	@Autowired
	private HelloWorldService helloWorldService;
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		
		System.out.println("==== hello진입 =====");
		
		String retVal = "";
		try{
			retVal = helloWorldService.helloWorld();
		
		}catch(Exception e){
			retVal = "error";
		}
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("retVal", retVal);
		
		return mv;
	}
}