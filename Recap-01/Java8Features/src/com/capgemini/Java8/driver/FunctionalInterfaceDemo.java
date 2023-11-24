package com.capgemini.Java8.driver;

import com.capgemini.Java8.model.FunctionalInterfaceA;
import com.capgemini.Java8.model.FunctionalInterfaceImpl;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
//		Normal Implementation
		FunctionalInterfaceA interfaceA = new FunctionalInterfaceImpl();
		interfaceA.display();
		
//		Inner Class Implementation
		FunctionalInterfaceA interfaceA2 = new FunctionalInterfaceA() {
			
			@Override
			public void display() {
				System.out.println("Display of interfaceA2");
			}
		};
		
		interfaceA2.display();
		
//		Lambda Exp Implementation
		FunctionalInterfaceA iA = (()-> {System.out.println("Displaying Using Using Lambda Expression");});
		iA.display();

	}

}
