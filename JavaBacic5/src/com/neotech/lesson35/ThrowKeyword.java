package com.neotech.lesson35;

class InsufficientFundsException extends RuntimeException 
{
	public InsufficientFundsException(String msg)
	{
		super(msg);
	}
}


public class ThrowKeyword {

	public static void main(String[] args) throws Exception {
		
		Exception ex = new Exception();
		ArithmeticException ae = new ArithmeticException();
		
		//throw ex;
		//throwException();
		
		try {
		withdraw(2000, 2500);
		}
		catch(InsufficientFundsException ife)
		{
			System.out.println(ife.getMessage());
		}
		
		//other codes go on
		//..
		//..
		System.out.println("End of code!");
	}
	
	
	public static void throwException()
	{
		throw new ArithmeticException();
	}
	
	public static void withdraw(int balance, int amount) throws Exception 
	{
		if (amount > balance)
		{
			throw new InsufficientFundsException("Insufficient Funds!");
		}
		
	}

}
//Exceptions: 
//	- unchecked: ArithmeticException, NullPointerException
//	- checked: FileNotFoundException, IOException
//	
//	- try catch block: handles the exception 
//	
//	- throw: used to throw an exception, 'cause an issue'
//			we can also throw custom/user created exceptions
//	- throws: added to the methods that can throw an exception
//		- doesn't handle itself, but it delegates the responsibility
//			to handle the exception to the caller.
