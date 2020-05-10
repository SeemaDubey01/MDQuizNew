package com.mdquiz.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class MdquizController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
}
