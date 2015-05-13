package com.ws.test;

public class Test
{
	public static void main(String[] args)
	{
		System.out.println ("test github...");
		
		if(isValid("name"))
		{
			
		}
	}

	private static boolean isValid(String name)
	{
		System.out.println ( "Test.isValid()" );
		boolean flag;
		if("admin".equals ( name ))
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		return flag;
	}
	
}
