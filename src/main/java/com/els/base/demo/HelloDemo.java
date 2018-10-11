package com.els.base.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/helloService")
public class HelloDemo {
	
	@RequestMapping("hello")
	@ResponseBody
	public String hello(){
		return "hello world!";
	}
	
	public static void main(String[] args) {
		System.out.println("测试springboot的打包!");
	}
}
