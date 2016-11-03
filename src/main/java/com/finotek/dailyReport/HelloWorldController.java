package com.finotek.dailyReport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.finotek.dailyReport.service.HelloWorldService;

@RestController
public class HelloWorldController {

	@Autowired
	private HelloWorldService helloWorldService;
	
	@RequestMapping("/hello")
	public String hello() {
		
		String retVal = "";
		try{
			retVal = helloWorldService.helloWorld();
		
		}catch(Exception e){
			retVal = "error";
		}
		
		return retVal;
	}
}