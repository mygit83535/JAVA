package com.sunbeam.entity;

import java.util.Scanner;


import com.sunbeam.exception.ExceptionLineTooLong;

public class StringLength {
	
			
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the string");
		    String s = sc.nextLine();
			
			
			try
			{
				int length = s.length();
				
				if(length > 80)
				{
					throw new ExceptionLineTooLong("The string is to long");
					
				}
				else 
				{
					System.out.println("String lenght is : ");
				}
			}
				catch(ExceptionLineTooLong e)
				{
					System.out.println("Exception:  " +e.getMessage());
				}
				
				finally
				{
					System.out.println("Inside finally block");
					sc.close();
			}
		
		

	}
	
}
