import java.io.*;
/*class ThrowsDemo
{
	 static void myFun() throws ArithmeticException, IOException;
	{ 
		int res =5/0;
		//throw new IOException();
	}
	public static void main(String args[])
	{ 
			System.out.println("Program execution started... ");
			try{
				myFun();
			}catch(ArithmeticException ae){
			System.out.println("Arithmetic Exception Caught");
	}
			System.out.println("Program Execution Completed");
	}
}
*/
class ThrowsDemo
{
	 static void myFun() throws ArithmeticException, IOException;
	{
		 System.out.println("myFun called");
		int res =5/0;
		throw new IOException();
	}
	public static void main(String args[])
	{ 
			
			try
			{
				myFun();

			}catch(IOException ae)
			{
			System.out.println("IOException Caught inside main");	
			}
			catch(ArithmeticException ae)
			{
				System.out.println("ArithmeticException Caught inside main");	
			}
System.out.println("Program Terminated Sucessfully");	
	}
	    
} 
