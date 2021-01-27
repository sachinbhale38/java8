package com.ingecno.patterns;

public class Star {
	public static void main(String args[])   
	{   
	//i for rows and j for columns      
	//row denotes the number of rows you want to print  
		
		for (int i = 0; i < 6; i++) 
		{
			for (int j = 6; j > i; j--)
			{
				System.out.print("* ");
				
			}
		System.out.println();

		}
	 
		
		for(int i=0; i<6; i++)   
		{   
		  for(int j=0; j<=i; j++)   
		{   
		System.out.print("* ");   
		}   
 
		System.out.println();   
		} 
		
		
		
		
	}   
}
