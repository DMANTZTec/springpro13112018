package com.dmantzapp.controller;



import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.dmantzapp.service.LoginService;

import ch.qos.logback.core.net.SyslogOutputStream;

@RestController
public class HelloWorldController {
	
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public  String userLogin() {
		System.out.println("user login() called");
					
		return "LOGIN SUCCESS" ;
		
	}
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public  String adminLogin() {
		System.out.println(" adminlogin() method called");
					
		return "admin LOGIN SUCCESS" ;
		
	}
}
