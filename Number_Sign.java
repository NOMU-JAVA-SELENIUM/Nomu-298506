package Assignments_22_05_26;
import Assignments_22_05_26.Number_Sign;

public class Number_Sign {
	
	public void Sign_Number()
	{
		int num = 56;
		if( num > 0)
		{
		System.out.println(num + " Is Positive");
		}
		else if(num < 0)
		{
			System.out.println(num + " Is Negative");
		}
		else {
			System.out.println("The number is zero");
		}
	}
	public static void main(String[] args) {
		Number_Sign obj = new Number_Sign();
		obj.Sign_Number();
	
	}

}
