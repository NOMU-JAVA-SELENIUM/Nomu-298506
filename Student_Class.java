package Assignments_21_05_26;

import Assignments_21_05_26.Student_Class;

public class Student_Class {

	public void display_student_details()
	{
		String name = "Bala Chandran";
		int age     = 30;
		int roll_number = 123673;
		System.out.println("Student name is " + name);
		System.out.println("Student age is " + age);
		System.out.println("Student roll_number is " + roll_number);
		
	}

	
public static void main(String[] args) {
	Student_Class obj = new Student_Class();
	obj.display_student_details();
		
}

}
