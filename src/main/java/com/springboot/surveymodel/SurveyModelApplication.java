package com.springboot.surveymodel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value=SurveyModelProperties.class)
public class SurveyModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurveyModelApplication.class, args);

	}

}
