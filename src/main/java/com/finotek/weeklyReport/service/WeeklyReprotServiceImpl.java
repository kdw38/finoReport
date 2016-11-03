package com.finotek.weeklyReport.service;

import org.springframework.stereotype.Service;

@Service
public class WeeklyReprotServiceImpl implements WeeklyReprotService {

	@Override
	public String helloWorld() throws Exception {
		return "Hello, Spring Boot!";
	}

}