package Assignments_25_05_26;
import Assignments_25_05_26.Method_Overloading;

public class Method_Overloading {
	// two int add method overloading
	public int add(int a, int b)
	{
		int c;
		c= a+b;
		System.out.println("Result of two int is: " + c);
		return c;
	}
	// three int add method overloading
	public int add(int a, int b, int c)
	{
		int res;
		res = a+b+c;
		System.out.println("Result of two int is: "+ res);
		return res;
	}
    // Main fun
	public static void main(String[] args) {
		// Obj creation
		Method_Overloading obj = new Method_Overloading();
		obj.add(18, 56);
		obj.add(45, 32, 12);

	}

}
