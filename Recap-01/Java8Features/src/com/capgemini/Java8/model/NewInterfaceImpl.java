package com.capgemini.Java8.model;

public class NewInterfaceImpl implements NewInterface, NewInterface2{

	@Override
	public void display() {
		System.out.println("Overrided Display Method");	
	}
	
	@Override
	public void defaultMethod(){
		System.out.println("Overrided defaultMethod");
	}
}
