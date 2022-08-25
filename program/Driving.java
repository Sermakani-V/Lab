/*
@Author: Sermakani V
Date   : 25/08/2022
Title  : Write a program that prompts the user to enter the distance to drive, the
         fuel efficiency of the car in miles per gallon, and the price per gallon,
         and displays the cost of the trip.
*/

import java.util.*;

class Driving
{
	public static void main(String[] args) 
	{
		double Cost_Of_Trip;
		
		Scanner sc = new Scanner(System.in);            /*user to enter the distance to drive, the fuel efficiency of the car 
		                                                     in miles per gallon, and the price per gallon*/
		
		System.out.print("The driving distace: ");   
        double distace = sc.nextDouble();  
		
		System.out.print("Miles per gallon is: ");
		double miles= sc.nextDouble();
		
		System.out.print("Price per gallon is: ");
		double price= sc.nextDouble();

		Cost_Of_Trip = (distace / miles) * price;                             //The cost of driving
		System.out.println("The cost of the trip is: " + Cost_Of_Trip);      // Display result
}
}