package Assignments_25_05_26;
import Assignments_25_05_26.Car;
public class Car extends Vehicle {
	
	void drive()
	{
		System.out.println("Repair the car");
	}

	public static void main(String[] args) {
		// Create obj to  Car class(child class)
		Car obj = new Car();
		obj.drive();
		

	}

}
