package com.springboot.surveymodel.dao;

import java.util.Map;



public interface SurveyResultsRepository {
	
	public Map<String,Integer> getAll();
	public int getA();
	public int getB();
	public int getC();
	public int getD();
	
}
