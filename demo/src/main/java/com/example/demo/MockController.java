package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/georg")
public class MockController {

	@PostMapping(path="/init")
	public @ResponseBody String test(HttpServletRequest request) {//@RequestParam String x,
		String bearerToken = request.getHeader("Authorization");
		return bearerToken;
	}
	
	@GetMapping(path="/get")
	public @ResponseBody String test(@RequestParam String x) {		
		return x;
	}
}