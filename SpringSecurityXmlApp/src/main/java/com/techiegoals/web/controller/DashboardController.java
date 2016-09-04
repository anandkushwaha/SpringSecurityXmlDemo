package com.techiegoals.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DashboardController {

	@RequestMapping(value = { "/", "/dashboard**" }, method = RequestMethod.GET)
	public ModelAndView dashboardPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World App.");
		model.addObject("message", "This is Dashboard page.");
		model.setViewName("Hello User!");
		return model;

	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World App.");
		model.addObject("message", "This is protected page.");
		model.setViewName("Hello Admin!");

		return model;

	}

}