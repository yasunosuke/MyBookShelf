package com.mybookshelf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InsightsController {
	
	@GetMapping("/insights")
	public String getIndex() {
		return "insights";
	}
}
