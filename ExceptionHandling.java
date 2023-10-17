import java.util.Scanner;


class ExceptionHandling
{
	public static void main(String args[])
	{ 
		System.out.println("Program execution started... ");
		//int a=5;
		//int b = 0;
		int a;
		int b;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter value for a and b ");
		a= sc.nextInt();
		b=sc.nextInt();
		int res= 0;
		res =a/b;
			
		System.out.println("Res: "+ res);
		System.out.println("Program executed successfuly ");

	}
}

/*
D:\JAVA Workspace\ExceptionHandling>java ExceptionHandling.java
Program execution started...
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExceptionHandling.main(ExceptionHandling.java:8)
*/