
class PrintStackTraceDemo           //stacktrace tells how get exception in program
{
	public static void myFun()
	{ 
		anotherFun();
	}
	public static void anotherFun()
	{ 
		int res = 5 / 0;
	}
	public static void main(String args[])
	{
		System.out.println("Program execution started... ");
		try{
		myFun();
		}catch(ArithmeticException ae)
		{
			System.out.println("Exception caught here....... ");
			ae.printStackTrace();
		}
		System.out.println("Program executed Succesfully ");
	}

}

/*
D:\JAVA Workspace\ExceptionHandling>java PrintStackTraceDemo.java
Program execution started...
Exception caught here.......
java.lang.ArithmeticException: / by zero
        at PrintStackTraceDemo.anotherFun(PrintStackTraceDemo.java:12)
        at PrintStackTraceDemo.myFun(PrintStackTraceDemo.java:7)
        at PrintStackTraceDemo.main(PrintStackTraceDemo.java:18)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
        at java.base/java.lang.reflect.Method.invoke(Method.java:577)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:421)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:192)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:132)
Program executed Succesfully

*/
