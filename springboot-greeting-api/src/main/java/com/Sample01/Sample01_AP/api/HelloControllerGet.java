package com.Sample01.Sample01_AP.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerGet {
//  1. Basic hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Priyanka...from get method...";
    }

//	Read data
//	1. query parameter
	@GetMapping("/greet")
	public String sayHello1(@RequestParam String name) {
		return "Hello miss "+name+" from get method...";
	}
//	2. optional query parameter
	@GetMapping("greet2")
	public String sayHello2(@RequestParam(defaultValue = "Priyanka") String name) {
		return "Hello miss "+name+" from get method...";
	}
//	3. using path parameter 
	@GetMapping("/greet/{name}")
	public String sayHello(@PathVariable String name) {
		return "Hello miss "+name+" from get method...";
	}
}
