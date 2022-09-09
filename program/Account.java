/*
@Author: Sermakani V
Date   : 08/09/2022
Title  : A class called Account, which models a bank account of a customer, is designed as shown 
         in the following class diagram. The methods credit(amount) and debit(amount) add or subtract 
         the given amount to the balance. The method transferTo(anotherAccount, amount) transfers the given 
         amount from this Account to the given anotherAccount. Write the Account class.
*/



import java.util.*;

 class BankAccount
{
	double balance;
	
	public void credit(double amount)
	{
		balance = balance + amount;
	}
	
	public void credit_1(double amount)
	{
		balance = balance + amount;
	}
	
	public double getBalance()
	{
	
	return balance;
	
	}
	
	
	public void debit(double amount, BankAccount anotherAccount)
	{
		anotherAccount.credit_1(amount);
		balance = balance - amount;
		System.out.println("Amount have to transfer: "+amount);
		System.out.println();
		System.out.println("---------After Transferred balance amount------------");
		System.out.println();
	}
	}
	
	class Account
	{
		public static void main(String[]args)
		{
			BankAccount obj = new BankAccount();
		    obj.credit(6000);
			System.out.println();
			System.out.println("Balance Amount in Account1: "+obj.getBalance());
			
			BankAccount obj1 = new BankAccount();
			obj1.credit_1(5000);
			System.out.println("Balance Amount in Account2: "+obj1.getBalance());
			System.out.println();
            
			obj1.debit(1000, obj);
			
			System.out.println("After transferred balance amount in Account1: "+obj.getBalance());
			System.out.println("After transferred balance amount in Account2: "+obj1.getBalance());
			
		}
	}
			