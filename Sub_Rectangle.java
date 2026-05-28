package Assignments_25_05_26;
import Assignments_25_05_26.Sub_Rectangle;

public class Sub_Rectangle extends Shape{
	
	void draw()
	{
		System.out.println("Draw a rectangle");
	}

	public static void main(String[] args) {
		// Create a obj to Sub_Rectangle
		Shape obj1 = new Shape();
		Shape obj2 = new Circle();
		Shape obj3 = new Sub_Rectangle();
		obj1.draw();
		obj2.draw();
		obj3.draw();

	}

}
