package com.Sample01.Sample01_AP;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerPost {
	
	@PostMapping("/hello")
	public String sayHello() {
		return "Welcome to home Piyanka...from post method";
	}
//	Read Data using query parameter
	@PostMapping("/greet")
	public String sayHello(@RequestParam String name) {
		return "Hello "+name+"...from post method";
	}
	
}
