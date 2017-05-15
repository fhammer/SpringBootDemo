package com.play.boot.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 这里主要是学习reset接口的初步实现
 * @author fuzh2
 *
 */
@RestController
public class HelloResource {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String greeting() {
		return "Hello World!";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public List<String> hello2() {
		return Arrays.asList(new String[] { "A", "B", "C" });
	}
}
