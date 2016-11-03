package com.finotek.dailyReport.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String helloWorld() throws Exception {
		return "Hello, Spring Boot! 한글깨짐 확인";
	}

}