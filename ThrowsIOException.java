import java.io.*;
class ThrowsIOException{

static void myFun() throws 
IOException
{
	anotherFun();
}
static void anotherFun() throws IOException
{
	throw new IOException("Explicitly generated exception");
}
public static void main(String args[])  throws IOException                    
{
	System.out.println("Program Execution started ");

	myFun();
      System.out.println("Program Execution Completed Sucssesfully ");

}
}

/*
D:\JAVA Workspace\ExceptionHandling>java ThrowsIOException.java
Program Execution started
Exception in thread "main" java.io.IOException: Explicitly generated exception
        at ThrowsIOException.anotherFun(ThrowsIOException.java:10)
        at ThrowsIOException.myFun(ThrowsIOException.java:6)
        at ThrowsIOException.main(ThrowsIOException.java:16) 

*/