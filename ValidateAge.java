package lab;

import java.util.Scanner;

class AgeException extends Exception {
	 
	 public AgeException(String str) {
	  System.out.println(str);
	 }
	}

public class ValidateAge {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter your age ");
		  int age = sc.nextInt();
		  
		  try {
		   if(age < 15) 
		    throw new AgeException("Invalid age");
		   else
		    System.out.println("Valid age");
		  }
		  catch (AgeException a) {
		   System.out.println(a);
		  }
		 }
 }
	
