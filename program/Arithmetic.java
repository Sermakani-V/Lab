/*

@Author: Sermakani V
Date   : 11/08/2022
Title  : Write a program called SumProductMinMax3 that prompts user for three integers. 
         The program shall read the inputs as int; compute the sum, product, 
	     minimum and maximum of the three integers; and print the results.

*/

import java.util.*;

class Arithmetic

{

    public static void main(String[] args) 
	
	{

        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        
		System.out.print("Enter Third Number: ");
        int num3 = sc.nextInt();
		
		int sum, product;
        
        sum = num1 + num2 + num3;        
        product = num1 * num2 * num3;

       //Condition for maximum number

      if (num1 >= num2 && num1 >= num3)
		{
         System.out.println("The maximum number: "+num1);
		}
      else if (num2 >= num1 && num2 >= num3)
	    {
         System.out.println("The maximum number: "+num2);
	    }
      else
	    {
         System.out.println("The maximum number: "+num3);
        }

      //Condition for minimum number

      if (num2 > num1 || num3 > num1)
	      {
            System.out.println("The minimum number: "+num1);
          }
      else if (num1 > num2 || num3 > num2)
	      {
            System.out.println("The minimum number: "+num2);
          }
      else 
		  {
            System.out.println("The minimum number: "+num3);
          }


   System.out.println("summation: "+sum);

   System.out.println("Multiplication: "+product);

       
   }
}
