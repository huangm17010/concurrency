package com.mmall.concurrency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/conc")
public class TestController {
	
	@RequestMapping(value="hello")
	@ResponseBody
	public String test(){
		return "hello world";
	}
}
