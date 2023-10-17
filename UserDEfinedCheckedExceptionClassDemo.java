class  UserDefinedCheckedExceptionClassDemo
{
	public static void main(String args[])
	{
		try
		{
			throw new MyException("MyException Due to Some logical error");

		}catch(MyException ae)
		{
			System.out.println("MyException Caught here");
			System.out.println(ae.getMessage());
		}
		System.out.println("Program terminate sucessful");
	}

}
class MyException extends Exception                        //checked exception
{
	MyException(String msg)
	{
		super(msg);
	}
}
/*
class MyException extends RuntimeException          //unchecked exception
{

}
*/

/*
D:\JAVA Workspace\ExceptionHandling>java UserDefinedCheckedExceptionClassDemo.java
MyException Caught here
MyException Due to Some logical error
Program terminate sucessful
*/