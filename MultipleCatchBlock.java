import java.util.Scanner;

class MultipleCatchBlock
{
	public static void main(String args[])
	{ 
		System.out.println("Program execution started... ");
		int arr[] ={2,4,6,8,10};
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
			System.out.println(arr[5]);
		}catch(ArithmeticException ae)
		{
                System.out.println("Exception ArithmeticException Caught");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
		System.out.println("ArrayIndexOutOfBoundsException Caught");
		}
		
		System.out.println("Res= a+b : "+ res);
		System.out.println("Program executed successfuly ");

	}
}
