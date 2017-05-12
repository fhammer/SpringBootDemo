package com.play.boot.rest;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.play.boot.entity.User;
import com.play.boot.service.UserService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/users")
public class UserResource {

	@Resource
	UserService userService;

	@RequestMapping("/add")
	public String addTable() {
		userService.initTable();
		return "Add Success";
	}

	@RequestMapping("/saves")
	public String saveUsers() {
		for (int i = 0; i < 10; i++) {
			userService.save("jege" + i, 25 + i);
		}
		return "OK";
	}

	// 处理删除
	@ApiOperation(value = "保存用户", notes = "根据用户名称和年龄来保存用户")
	@ApiImplicitParam(name = "name", value = "用户名称", required = true, dataType = "Long")
	@RequestMapping("/save")
	public User saveUser(@RequestParam("name") String name, @RequestParam("age") int age) {
		return userService.save(name, age);
	}

	@RequestMapping("/timeline")
	public List<User> getAllUser() {
		List<User> allUsers = userService.allUsers();
		return allUsers;
	}

}
