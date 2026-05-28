package Assignments_22_05_26;
import Assignments_22_05_26.CountDigits;

public class CountDigits {
	public void digit_counts()
	{
		int num = 1235;
		int count = 0;
		int temp = num;
		while(temp != 0)
		{
			temp /= 10;
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDigits obj = new CountDigits();
		obj.digit_counts();

	}

}
