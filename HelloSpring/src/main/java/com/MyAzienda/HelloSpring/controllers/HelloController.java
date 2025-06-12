package com.MyAzienda.HelloSpring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

	@GetMapping("saluta")
	public String salutaTutti() {
		return "Ciao da Spring";
	}
}
