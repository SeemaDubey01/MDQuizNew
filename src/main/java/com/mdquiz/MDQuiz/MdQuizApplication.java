package com.mdquiz.MDQuiz;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class MdQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdQuizApplication.class, args);
	}
	
	@RequestMapping("/")
	public String home(Map<String, Object> model) {
    model.put("message", "HowToDoInJava Reader !!");
    return "index";
}

	@RequestMapping("/home")
	public String next(Map<String, Object> model) {
    model.put("message", "You are in new page !!");
    return "home.jsp";
}
}

