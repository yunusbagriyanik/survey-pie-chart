package com.springboot.surveymodel.model;

public class Choices {
	
	private int id;
	private int a;
	private int b;
	private int c;
	private int d;
	
	private int numberOfParticipants;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getNumberOfParticipants() {
		return numberOfParticipants;
	}
	
	public void setNumberOfParticipants(int numberOfParticipants) {
		this.numberOfParticipants = numberOfParticipants;
	}
	@Override
	public String toString() {
		return "Choices [id=" + id + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", numberOfParticipants="
				+ numberOfParticipants + "]";
	}

	
	
	

}
