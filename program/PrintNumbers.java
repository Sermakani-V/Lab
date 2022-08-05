/*
@Author: Sermakani V
Date: 04/08/2022
Title: Write an application that displays the number 1 to 4 on the same line, with each pair of
       * adjacent numbers separated by one space. 
	   
Executing basic Java program
*/

class PrintNumbers
{
	public static void main(String[] args) 
	{
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4;   
		                                                  // (a) Use one System.out.println statement.
		System.out.println("Section (a)");
		System.out.println(num1+" "+num2+" "+num3+" "+num4);
		
		System.out.println();
		                                                 // (b) Use four System.out.print statements.
		System.out.println("Section (b)");					 
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		System.out.print(num3+" ");
		System.out.print(num4);
		
		System.out.println("\n");
		                                                 // (c) Use one System.out.printf statement.
		System.out.println("Section (c)");
		System.out.printf("%d %d %d %d", num1,num2,num3,num4);
		
	}	
	
}