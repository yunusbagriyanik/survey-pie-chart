package com.springboot.surveymodel.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.surveymodel.service.SurveyResultsService;

@Controller
@RequestMapping("/survey")
public class SurveyController {
	
	@Autowired
	private SurveyResultsService surveyResultsService;
	
	@GetMapping("/home")
	public String homepage() {
		return "home";
	}
	
	@GetMapping("/home2")
	public ModelAndView homepage2() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("jsphome");
		return mav;
	}
	
	@GetMapping("/displayBarGraph")
	public String barGraph(Model model) {
		
		model.addAttribute("surveyMap",surveyResultsService.getAll());
		return "barGraph";
	}
	
	@GetMapping("/displayPieChart")
	public String pieChart(Model model) {
		model.addAttribute("A",surveyResultsService.getA());
		model.addAttribute("B",surveyResultsService.getB());
		model.addAttribute("C",surveyResultsService.getC());
		model.addAttribute("D",surveyResultsService.getD());
		return "pieChart";
	}
	
	@PostMapping("/process")
	public String processResults() {
		
		return "home";
	}

}
