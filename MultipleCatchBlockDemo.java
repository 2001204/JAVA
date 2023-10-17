import java.io.*;
class MultipleCatchBlockDemo
{
	public static void main(String args[])
	{
		try
		{
			//
		}catch(ArithmeticException ae){

		}
		catch(Exception e){

		 }
			
		System.out.println("Program Execution Completed Sucssesfully ");
	}
} 
/*
D:\JAVA Workspace\ExceptionHandling>java MultipleCatchBlockDemo.java
Program Execution Completed Sucssesfully
*/
//child class handler must before parent classs handeler
/*
class MultipleCatchBlockDemo
{
	public static void main(String args[])
	{
		try
		{
			//
		}catch(Exception e){

		 }
			
catch(ArithmeticException ae){

		}
		
		System.out.println("Program Execution Completed Sucssesfully ");
	}
} 

D:\JAVA Workspace\ExceptionHandling>java MultipleCatchBlockDemo.java
MultipleCatchBlockDemo.java:31: error: exception ArithmeticException has already been caught
catch(ArithmeticException ae){
^
1 error
error: compilation failed

*/