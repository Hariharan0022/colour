package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class colour {
	@GetMapping("/color")
	public String getName() {
		String name="Blue";
		return "My favurite colour is" +name+  "!";
	}

}
