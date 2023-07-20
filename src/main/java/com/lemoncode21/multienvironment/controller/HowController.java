package com.lemoncode21.multienvironment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HowController {
	
	@Value(value = "${spring.profiles.active}")
	private String profile;

	@GetMapping("/")
	public String homepage() {
		return "지금 활동 중인 프로필: " + profile;
	}
}
