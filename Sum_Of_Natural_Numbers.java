package Assignments_22_05_26;
import Assignments_22_05_26.Sum_Of_Natural_Numbers;
public class Sum_Of_Natural_Numbers {
	
	public void natural_num_sum()
	{
		int n = 10; 
		int sum = 0;
		for(int i=0; i<= n; i++)
		{
			sum+=i;
		}
		System.out.println("Sum of first natural numbers is: "+ sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_Of_Natural_Numbers obj = new Sum_Of_Natural_Numbers();
		obj.natural_num_sum();

	}

}
