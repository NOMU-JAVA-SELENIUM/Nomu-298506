package Assignments_25_05_26;
import Assignments_25_05_26.Rectangle;

public class Rectangle {
	private int len;
	private int wid;
	
	public int get_rectangle_return_len()
	{
		return len;
	}
	
	public int get_rectangle_return_wid()
	{
		return wid;
	}
	public void set_rectangle_len(int len)
	
	{
		this.len = len;
	}
	
   public void set_rectangle_wid(int wid)
	
	{
		this.wid = wid;
	}
   
   public int area()
   {
	   return len * wid;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle();
		obj.set_rectangle_len(6);
		obj.set_rectangle_wid(4);
		System.out.println("len value is: " + obj.get_rectangle_return_len());
		System.out.println("len value is: " + obj.get_rectangle_return_wid());
		System.out.println("Rectangle area is: "+ obj.area());

	}

}
