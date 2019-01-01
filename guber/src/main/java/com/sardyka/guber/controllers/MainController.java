package com.sardyka.guber.controllers;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sardyka.guber.beans.TaxiCompany;
import com.sardyka.guber.services.SuperService;
import com.sardyka.guber.services.TaxiCompanyService;

@Controller
public class MainController {
	
	@Value("${application.message: Hi, Spring Booterrrr!}")
	private String message = "Default message";
	
	@Autowired
	private SuperService superService;
	
	@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", message);
		return "welcome";
	}
	
	@GetMapping(value = "/cabList")
	public ModelAndView getCabs() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("cabs", superService.getCabs());
		modelAndView.setViewName("cabList");
		return modelAndView;				
	}
	
	@Autowired
	private TaxiCompanyService taxiCompanyService;
	
	@GetMapping(value = "/taxiCompany")
	public ModelAndView getTaxiCompany() {
		ModelAndView modelAndView = new ModelAndView();
		
		final List<TaxiCompany> result = taxiCompanyService.findByName("Landyshi");
		modelAndView.addObject("taxiCompanies", result);
		modelAndView.setViewName("taxiCompany");
		return modelAndView;
	}
	
}
