package com.capgemini.Java8.driver;

import com.capgemini.Java8.model.Vehicle;

public class VehicleDemo{

	public static void main(String[] args) {
		
		Vehicle cycle = ()->{
			System.out.println("Moves Very Slowly");
		};
		cycle.move();


	}
}