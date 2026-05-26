package Assignments_21_05_26;

import Assignments_21_05_26.Book_Class;

public class Book_Class {

	public void displayBook()
	{
		String title = "Rich Dad and Poor Dad";
		String author = "Robert kiosaki";
		int price = 500;
		System.out.println("Book title: " + title);
		System.out.println("Book author: " + author);
		System.out.println("Book price:  " + price);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book_Class obj = new Book_Class();
		obj.displayBook();
		

	}

}
