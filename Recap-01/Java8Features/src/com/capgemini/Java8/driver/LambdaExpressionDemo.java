package com.capgemini.Java8.driver;

import com.capgemini.Java8.model.A;
import com.capgemini.Java8.model.AImpl;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		
		A a1 = new AImpl();
		a1.display(10, 3.5f);
		
		/*---------------------------------------*/		
		
		System.out.println("---------------------------------------");
		
		A a2 = new A() {
			
			@Override
			public void display(int a, float b) {
				System.out.println("Implementing using Anonymous Inner Class");
				System.out.println("a = " +a+ " b = " +b);
			}
		};
		a2.display(10, 3.5f);
		
		/*---------------------------------------*/
		
		System.out.println("---------------------------------------");
		
		A aLmabda = (a, b) -> {
			System.out.println("Implementing using Lambda Exp");
			System.out.println("a = " +a+ " b = " +b);
		};
		aLmabda.display(10, 3.5f);
		
		System.out.println("---------------------------------------");
		
	}

}
