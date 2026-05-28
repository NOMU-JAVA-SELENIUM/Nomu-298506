package Assignments_22_05_26;

import Assignments_22_05_26.Number_Divisible;

public class Number_Divisible {

	public void number_divisible(int num)
	{
		if(num % 5 ==0 && num % 11 ==0)
		{
			System.out.println("Divisible by 5 and 11 and num value is: " + num);
			
			
		}
		else
		{
			System.out.println("Not Divisible by 5 and 11: " + num);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number_Divisible obj = new Number_Divisible();
		obj.number_divisible(15);

	}

}
