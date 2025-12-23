package com.rohit.ExceptionHandling;

import java.util.Arrays;

public class ArrayStoreExample {
	
	public static void storeOject()
	{
		Object [] arr= new String[5];
		arr[0]="Hello";
		arr[1]="World";
		arr[2]="Java";
		arr[3]="ads";
		
		System.out.println("Objects stored successfully.");
		
		}
	void main()
	{
		
		try
		{
			storeOject();
		}
		catch(ArrayStoreException e)
		{
			System.out.println("ArrayStoreException caught: Incompatible type:"+e.getMessage()+" cannot be stored in an array of java.lang.String"
					);
		}
	}
	

}

