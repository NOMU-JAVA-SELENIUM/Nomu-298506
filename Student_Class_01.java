package Assignments_22_05_26;
import Assignments_22_05_26.Student_Class_01;

public class Student_Class_01 {

	public void  display_student_marks()
	{
		String student_name = "Bala Krishna";
	    int maths_marks = 65;
		int pass_marks = 25;
		int fail_marks = 24;
		if(pass_marks <= maths_marks) {
			System.out.println(student_name + " is passed");
		}
		else if(maths_marks <= fail_marks) {
			System.out.println(student_name + " is failed");
		}
		else
		{
			System.out.println(student_name + "not attended the exam");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Class_01 obj = new Student_Class_01();
		obj.display_student_marks();

	}

}
