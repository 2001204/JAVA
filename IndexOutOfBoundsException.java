import java.util.Scanner;


class IndexOutOfBoundsException
{
	public static void main(String args[])
	{ 
		System.out.println("Program execution started... ");
		int arr[] ={2,4,6,8,10};

		//for (int i=0; i<arr.length; i++)       //sucssesfully
		
		try{
			for (int i=0; i<6; i++)
			{
				System.out.println("arr["+ i+ " ] :- " + arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("exception Caught successfuly ");
		}
		
		System.out.println("Program executed successfuly ");

	}
}

/*
D:\JAVA Workspace\ExceptionHandling>java IndexOutOfBoundsException.java
Program execution started...
arr[0 ] :- 2
arr[1 ] :- 4
arr[2 ] :- 6
arr[3 ] :- 8
arr[4 ] :- 10
Program executed successfuly

*/ 

/*

D:\JAVA Workspace\ExceptionHandling>java IndexOutOfBoundsException.java
Program execution started...
arr[0 ] :- 2
arr[1 ] :- 4
arr[2 ] :- 6
arr[3 ] :- 8
arr[4 ] :- 10
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at IndexOutOfBoundsException.main(IndexOutOfBoundsException.java:14)
*/