package com.capgemini.Java8.driver;

import java.util.ArrayList;

public class StreamDemo {
	public static void main(String[] args) {
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		strList.add("D");
		
		strList.stream().filter(s -> s.startsWith("A")||s.startsWith("a")).collect(null);
		
	}
}
