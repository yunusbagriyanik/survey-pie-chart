package com.springboot.surveymodel;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix="survey")
public class SurveyModelProperties {
	
	private boolean displayResults=false;

	public boolean isDisplayResults() {
		return displayResults;
	}

	public void setDisplayResults(boolean displayResults) {
		this.displayResults = displayResults;
	}
	
	

}
