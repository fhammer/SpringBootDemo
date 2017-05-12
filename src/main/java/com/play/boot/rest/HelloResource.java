package com.play.boot.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@RequestMapping("/")
	public String greeting() {
		return "Hello World!";
	}

	@RequestMapping("/hello")
	public List<String> hello2() {
		return Arrays.asList(new String[] { "A", "B", "C" });
	}
}
