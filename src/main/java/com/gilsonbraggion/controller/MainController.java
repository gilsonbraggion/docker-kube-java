package com.gilsonbraggion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
public class MainController {

	@GetMapping
	public String main() {
		return "Chamou o método main de teste";
	}

	@GetMapping(value = "/interno")
	public String interno() {
		return "Chamou o método interno de teste";
	}
	
}
