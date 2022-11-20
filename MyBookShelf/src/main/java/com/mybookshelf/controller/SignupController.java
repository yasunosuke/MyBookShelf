package com.mybookshelf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mybookshelf.form.GroupOrder;
import com.mybookshelf.form.SignupForm;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class SignupController {
	
	@GetMapping("/signup")
	public String getSignup(@ModelAttribute SignupForm form) {
		return "signup/signup";
	}
	
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute @Validated(GroupOrder.class) SignupForm form, BindingResult bindingResult) {

		if(bindingResult.hasErrors()) {
//			return to /signup
			return getSignup(form);
		}
		
		log.info(form.toString());
		return "redirect:/login";
	}
}
