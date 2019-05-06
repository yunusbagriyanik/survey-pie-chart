package com.springboot.surveymodel.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.surveymodel.dao.SurveyResultsRepository;

@Service
public class SurveyResultServiceImpl implements SurveyResultsService {
	
	private SurveyResultsRepository surveyResultsRepository;
	
	@Autowired
	public SurveyResultServiceImpl(SurveyResultsRepository surveyResultsRepository) {
		this.surveyResultsRepository=surveyResultsRepository;
	}

	@Override
	public Map<String, Integer> getAll() {
		return surveyResultsRepository.getAll();
	}

	@Override
	public int getA() {
		return surveyResultsRepository.getA();
	}

	@Override
	public int getB() {
		return surveyResultsRepository.getB();
	}

	@Override
	public int getC() {
		return surveyResultsRepository.getC();
	}

	@Override
	public int getD() {
		return surveyResultsRepository.getD();
	}

}
