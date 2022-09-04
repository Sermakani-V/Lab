/*
@Author: Sermakani V
Date   : 01/09/2022
Title  : Write a program that prompts the user to get the Vehicle, Animal or Employee details
         by calling a method using construtor. If not, please exit from the code.
*/

import java.io.*;
import java.util.Scanner;

class Dev1
{ 
  String name;
  int year;
  String color, sound;
  
  Dev1(String a, int b, String c)
  {
	  this.name= a;
	  this.year= b;
	  this.color= c;
  }
  Dev1(String a1, String b1, String c1)
  {
	  this.name= a1;
	  this.sound= b1;
	  this.color= c1;
  }
  
  public void display1()
  {
	  System.out.println("Name of the Vehicle: Honda");
	  System.out.println("Year of introduced: 1999");
	  System.out.println("Color of the vehicle: Blue");
	  System.out.println();
	  
  }
  
  public void display2()
  {
	  System.out.println("Name of the Animal: Dog");
	  System.out.println("Sound of the Animal: Bark");
	  System.out.println("Color of the Animal: White");
	  System.out.println();
	  
  }
  
  public void display3()
  {
	  System.out.println("Name of the Employee: Raju");
	  System.out.println("Year of Joining: 2010");
	  System.out.println("Employee Id: 1234");
	  System.out.println();
	  
  }
  
}

class Demo_1
{
	public static void main(String[]args)
	{   
	    int i;
		Scanner in = new Scanner(System.in); 
		System.out.println("------A. Vehicle---------");
		System.out.println("------B. Animal---------");
		System.out.println("------C. Employee-----------");
		System.out.println();
	Dev1 obj1=new Dev1("Honda", 1999, "Green");
	Dev1 obj2=new Dev1("Dog", "Bark", "White");
	Dev1 obj3=new Dev1("Raju", 2010, "1234");
	
	do
	{
		System.out.print("Enter your choice:  ");
		char choice = in.next().charAt(0);
		
		switch(choice)
		{
			case 'A':
			System.out.println();
			System.out.println("Details of----'Honda'----to display....");
			System.out.println();
			obj1.display1();
			break;
			
			case 'B':
			System.out.println();
			System.out.println("Details of-----'Dog'------to display: ");
			System.out.println();
			obj2.display2();
			break;
			
			case 'C':
			System.out.println();
			System.out.println("Details of-----'Employee'---to display: ");
			System.out.println();
			obj3.display3();
			break;
		}
			
		System.out.println("Do you want to exit.....press any number key");
		i = in.nextInt();
	}
	while(i==0);
	System.out.println();
	System.out.println("Thank you");
	
	}
}
	
	
	
	