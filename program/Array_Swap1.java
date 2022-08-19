/*
@Author: Sermakani V
Date   : 18/08/2022
Title  : Write a simple program to swap a two elements in an given array using 
         index and also to find first, middle and last value in a array.
*/

import java.util.Scanner;

class Array_Swap1
{
    public static void main(String[] args) 
		{
            Scanner sc = new Scanner(System.in);

            int numbers[]= { 10,20,30,40,50,60,70,80,90,100 };
            int temp = 0, second;
            int index1 = 0 , index2 = 0;
            int j , k ;
            int first  = numbers[0];
			int last= numbers[9];
			int mid= numbers[5];
            
			System.out.println();
			System.out.println("Length of values: "+numbers.length);
            System.out.println();
            System.out.println("First value: "+first);
			System.out.println();
			System.out.println("last value: "+last);
			System.out.println();
			System.out.println("middle value: "+mid);
			System.out.println();
            System.out.println("Before the swap: ");
		
			
			
            for (int i = 0; i < numbers.length; i++) 
			{
                System.out.print(numbers[i] + " ");
			}
			
			System.out.println();
			System.out.println();
            System.out.println("Enter the first number to swap:");
            first = sc.nextInt();
            System.out.println("Enter the second number to swap:");
            second = sc.nextInt();
            System.out.println();
            
			for(k = 0 ; k < numbers.length; k++)
			{
                if(numbers[k] == first)
                    index1 = k;
            }
            for(j = 0 ; j < numbers.length; j++)
			{
                if(numbers[j] == second)
                    index2 = j;
            }
			
			
			temp = numbers[index1];
            numbers[index1] = numbers[index2];
            numbers[index2] = temp;

            System.out.println("After the swap:");
            
			for (int i = 0; i < numbers.length; i++) 
			{
                System.out.print(numbers[i] + " ");
				
            }
        }
}