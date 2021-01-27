package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String get() {
		return "My Spring boot Application.";
	}
}
