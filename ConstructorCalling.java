// Constructor Calling Demo

public class ConstructorCalling{
	public static void main(String args[])
	{
		new Third();
	}
}
class First{
	First()
	{
		System.out.println("First Constructor");
	}
}

class Second extends First{
	 Second()
	{
		System.out.println("Second Constructor");
	}
}

class Third extends Second{
	 Third()
	{
		System.out.println("Third Constructor");
	}
}


/*

D:\JAVA Workspace\Inheritance>java ConstructorCalling.java
First Constructor
Second Constructor
Third Constructor

*/