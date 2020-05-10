package com.mdquiz.MDQuiz;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class MdQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdQuizApplication.class, args);
	}
	@RequestMapping("/home")
	public String home() {
    return "home";
}

}
