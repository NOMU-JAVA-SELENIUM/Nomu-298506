package Assignments_22_05_26;
import Assignments_22_05_26.Factorial_Number;

public class Factorial_Number {
	
	public void factorial_num()
	{
		int num = 5;
		int i;
		int fact = 1;
		for(i=1; i<=num; i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial_Number obj = new Factorial_Number();
		obj.factorial_num();

	}

}
