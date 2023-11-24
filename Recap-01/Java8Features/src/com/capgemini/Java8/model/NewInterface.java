package com.capgemini.Java8.model;

public interface NewInterface {
	
	void display();
	
	static void printSomething() {
		System.out.println("Inside Static Method of Interface");
	}
	
	public default void defaultMethod() {
		System.out.println("Default Method of Interface A");
	}

}
