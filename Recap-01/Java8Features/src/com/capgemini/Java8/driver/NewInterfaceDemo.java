package com.capgemini.Java8.driver;

import com.capgemini.Java8.model.NewInterface;
import com.capgemini.Java8.model.NewInterfaceImpl;

public class NewInterfaceDemo {

	public static void main(String[] args) {
		NewInterface newInterface = new NewInterfaceImpl();
		newInterface.display();
		newInterface.defaultMethod();
		NewInterface.printSomething();
	}

}
