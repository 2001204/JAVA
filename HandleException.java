import java.util.Scanner;

class HandleException
{
	public static void main(String args[])
	{ 
		System.out.println("Program execution started... ");
		int a;
		int b;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter value for a and b ");
		a= sc.nextInt();
		b=sc.nextInt();
		int res= 0;
		try
		{
			res =a/b;	
			System.out.println("result calculation done ");
		}catch(ArithmeticException ae)
		{
                System.out.println("Exception Catch successfuly ");
		}
		System.out.println("Res: "+ res);
		System.out.println("Program executed successfuly ");

	}
}


/*
D:\JAVA Workspace\ExceptionHandling>java HandleException.java
Program execution started...
Enter value for a and b
12
0
Exception Catch successfuly
Res: 0
Program executed successfuly

*/

/*
D:\JAVA Workspace\ExceptionHandling>java HandleException.java
Program execution started...
Enter value for a and b
12
4
result calculation done
Res: 3
Program executed successfuly
*/