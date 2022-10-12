/*
@Author: Sermakani V
Date   : 12/10/2022
Title  : Take a sentence as a user input. 
         Break up the sentence into words.
         Sort the words based on the length of the word - and print out.

         Example: If user inputs the sentence: "Hi, welcome to this mentoring session".
*/
import java.util.Scanner; 
import java.util.Arrays;  

class Split_SortString  
{  
public static void main(String args[])   
  {  
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter the sentence: ");
    String str = sc.nextLine();  
    
	System.out.println("Sentence is: " + str);
    
	String [] Session = str. split(" ");
for (String sb : Session)
   System. out. println(sb);
int size = Session.length;  
for(int i = 0; i<size-1; i++)   
 {  
  for (int j = i+1; j<Session.length; j++)   
   {  
      if(Session[i].compareTo(Session[j])>0)   
        {  
           String temp = Session[i];  
           Session[i] = Session[j];  
           Session[j] = temp;  
        }  
   }  
 }  
System.out.print(Arrays.toString(Session));  
  }  
}  