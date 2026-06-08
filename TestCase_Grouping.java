package Assignments_02_06_26;

import org.testng.annotations.Test;

public class TestCase_Grouping {
	@Test(groups = {"unit Test"})
	public void test1()
	{
		System.out.println("This is Test1");
	}
	@Test(groups = {"unit Test", "Integration Test"})
	public void test2()	
	{
		System.out.println("This is Test2");
	}
	@Test(groups = {"System Test"})
	
	public void test3()
	{
		System.out.println("This is Test3");
	}

}
