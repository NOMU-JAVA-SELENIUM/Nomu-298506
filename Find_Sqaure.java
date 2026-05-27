package Assignments_21_05_26;

import Assignments_21_05_26.Find_Sqaure;

public class Find_Sqaure {

	public int findsqaure()
	{
		int num = 8;
		int find_sqaure_result = num*num;
		return find_sqaure_result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Find_Sqaure obj = new Find_Sqaure();
		int result = obj.findsqaure();
		System.out.println(result);
	}

}
