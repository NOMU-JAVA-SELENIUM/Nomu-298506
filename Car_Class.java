package Assignments_21_05_26;

import Assignments_21_05_26.Car_Class;

public class Car_Class {
	
	String brand = "Audi";
	String model = "2025_model_6574848";
	int price = 925000;
	
	public void startCar()
	{
		System.out.println("Engine started");
	}
	public void stopCar()
	{
		System.out.println("Engine stopped");
		
	}

	public static void main(String[] args) {
		// Object Creation
		Car_Class obj = new Car_Class();
		obj.startCar();
		obj.stopCar();

	}

}

