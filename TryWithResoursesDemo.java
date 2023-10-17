import java.io.*;
class TryWithResoursesDemo
{
	public static void main(String args[])
	{
		try
		{
			try(FileReader fr = new FileReader("myfile.txt"))
			{
				System.out.println("within try block");
			}
			finally
			{
				System.out.println("within finally block");
			}
		}catch(IOException ex )
		{
			 System.out.println("FileNotFoundException ");
		}
		System.out.println("program execution  Sucssesfully ");
	}
} 
/*
D:\JAVA Workspace\ExceptionHandling>java TryWithResoursesDemo.java
within finally block
FileNotFoundException
program execution  Sucssesfully
*/