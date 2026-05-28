package Assignments_22_05_26;
import Assignments_22_05_26.Prime_Number;

public class Prime_Number {
	
	public void prime_num()
	{
		int i, count = 1, n=11;
		for(i=1;i<= n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count ==2)
		{
			System.out.println("Given num is prime num");
		}
		else
		{
			System.out.println("Given num is not a prime num");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime_Number obj = new Prime_Number();
		obj.prime_num();

	}

}
