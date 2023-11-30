package com.capgemini.Java8.model;

public class AImpl implements A{

	@Override
	public void display(int a, float b) {
		System.out.println("Normal Overriding using Another Class");
		System.out.println("a = " +a+ " b = " +b);
	}

}
