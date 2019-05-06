package com.springboot.surveymodel.daotest;


import java.util.LinkedHashMap;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.springboot.surveymodel.dao.SurveyResultsRepository;
import com.springboot.surveymodel.model.Choices;

@Repository
public class ResultRepositoryMemoryImpl implements SurveyResultsRepository {
	
	Map<String, Integer> surveyMap=new LinkedHashMap<>();
	
	public ResultRepositoryMemoryImpl() {
	
		surveyMap.put("A", getA());
		surveyMap.put("B", getB());
		surveyMap.put("C", getC());
		surveyMap.put("D", getD());
	}
	
	@Override
	public Map<String,Integer> getAll(){
		return surveyMap;
	}

	@Override
	public int getA() {
		Choices choices=new Choices();
		choices.setA(45);
		int a=choices.getA();
		return a;
	}

	@Override
	public int getB() {
		Choices choices=new Choices();
		choices.setB(20);
		return choices.getB();
	}

	@Override
	public int getC() {
		Choices choices=new Choices();
		choices.setC(15);
		return choices.getC();
	}

	@Override
	public int getD() {
		Choices choices=new Choices();
		choices.setD(20);
		return choices.getD();
	}


}
