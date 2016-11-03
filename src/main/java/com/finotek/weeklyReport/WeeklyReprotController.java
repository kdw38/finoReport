package com.finotek.weeklyReport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.finotek.weeklyReport.service.WeeklyReprotService;

@RestController
public class WeeklyReprotController {

	@Autowired
	private WeeklyReprotService helloWorldService;
	
	@RequestMapping("/weekly")
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