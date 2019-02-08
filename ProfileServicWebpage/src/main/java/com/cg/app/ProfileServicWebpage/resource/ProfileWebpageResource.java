package com.cg.app.ProfileServicWebpage.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProfileWebpageResource {

	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/")
	public String depositForm() {
		return "index";	
	}
	@RequestMapping("/signUp")
	public String signUp() {
		return "signUpForm";
	}
	
	@RequestMapping("/signIn")
	public String signIn() {
		return "signInForm";
	}
	
}
