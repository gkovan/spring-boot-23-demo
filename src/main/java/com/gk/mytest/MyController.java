package com.gk.mytest;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/hi")
	public String sayHi() {
		return "hi";
	}
	
	
	@PostMapping("/mypost")
	public Map<String,Object> myPost(@RequestBody Map<String,Object> myRequest) {
		return myRequest;
	}

}
