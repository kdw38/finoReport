package com.finotek.dailyReport.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public interface HelloWorldService {
	public String helloWorld() throws Exception;
}