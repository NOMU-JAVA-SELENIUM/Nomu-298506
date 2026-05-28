package Assignments_22_05_26;
import Assignments_22_05_26.Palindrome;

public class Palindrome {
	
	public void Palindrome_Num()
	{
		int num = 121;
		int original = num;
		int reversed = 0;
		while(num !=0)
		{
			int digit = num%10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		if(original == reversed)
		{
			System.out.println(original + " is  a Palindrome number");
		}
		else
		{
			System.out.println(original + " is Not a Palindrome number");
		}


	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Palindrome obj = new Palindrome();
		obj.Palindrome_Num();
	}

}
