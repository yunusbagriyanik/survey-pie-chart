package com.springboot.surveymodel;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SurveyModelConfiguration {
	
	@Autowired
	private SurveyModelProperties surveyModelProperties;
	
	@PostConstruct
	public void init() {
		System.out.println("Display Results: "+surveyModelProperties.isDisplayResults());
	}

}
