/*
@Author: Sermakani V
Date   : 15/09/2022
Title  : Join Threads: Finish until thread finishes execution, then progress
         * the code Reminder: your method is also a thread so without joining
         * threads System.out.println("Count is: " + count); will work
         * immediately. Join does not terminate Thread 2, just progress of the
         * code stops until Threads terminate.
*/

import java.util.ArrayList;
import java.util.List;

class Emp extends Thread{
	
	@Override
	 synchronized public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName());
			}
			catch (InterruptedException e) {
				// TODO: handle exception
			}
			
			Thread_Array.name.add(getName());
		}
	}
	
}

public class Thread_Array {


	public static List<String> name = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      
		List<Emp> list1 = new ArrayList<Emp>();
		
		for(int i=10;i <15;i++ ) {
			Emp obj = new Emp();
			
			list1.add(obj);
			obj.start();
		}
		for(Emp temp : list1 ) {
			try {
				temp.join();
			}
			catch(Exception e) {
				
			}
		}
		
		System.out.println();
		System.out.println("Name of the Thread:   "+name);
		
		System.out.println();
		System.out.println("Thread from the method:  "+ Thread.currentThread().getName());
	}
}