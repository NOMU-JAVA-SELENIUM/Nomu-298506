package Assignments_21_05_26;

import Assignments_21_05_26.Data_Types;

public class Data_Types {
	
	public int add()
	{
		int a = 20;
		int b = 40;
		int c= a+b;
		return c;
	}
	
	public double sub()
	{
		double a = 6.04;
		double b = 4.05;
		double c = a-b;
		return c;
	}
	
	public String SetData()
	{
		String str = "Welcome to Java tutorials";
		return str;
	}
	
	public Boolean SetTrue()
	{
		Boolean b = true;
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data_Types obj = new Data_Types();
		// Call add
		int add_res = obj.add();
		//addition result
		System.out.println(add_res);
		// Call sub
	    double double_res = obj.sub();
		// double result
		System.out.println(double_res);
		// Call string
	    String Str_res = obj.SetData();
		// String result
		System.out.println(Str_res);
		// Call Boolean
	    Boolean Bool_res = obj.SetTrue();
		// Boolean result
		System.out.println(Bool_res);

	}

}

