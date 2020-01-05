package com.audittool.audito.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.audittool.audito.beans.DailyTask;
import com.audittool.audito.beans.LoginStatus;
import com.audittool.audito.beans.User;
import com.audittool.audito.data.TestData;

@RestController
public class MainController {
	
	@GetMapping("/status")
	public String status() {
		return "success";
	}
	
	@PostMapping("/login")
	public LoginStatus login(@RequestBody User user) {
		LoginStatus status = new LoginStatus();
		if(null != user && "admin".equals(user.getUserName()) 
				&& "admin".equals(user.getPassword())) {
			status.setUserName(user.getUserName());
			status.setStatus("success");
			return status;
		}
		status.setUserName(user.getUserName());
		status.setStatus("failure");
		return status;
	}
	
	
	
}
