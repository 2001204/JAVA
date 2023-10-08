
class MethodHiding
{
 	public static void main( String args[ ])
   	{
		System.out.println("Program Execute Successfully");
		Second s = new Second();
		s.Fun();
	}
}

class First
{
	static void oneFun()
	{
		System.out.println("oneFun of First");
	
	}
	void Fun()
	{
		System.out.println("Fun of First");
		myFun();
		oneFun();
	}
	
	private void myFun()               //compile time binding
	//void myFun()                               //run time binding
	{
		System.out.println("myFun of First");
	}
}

class Second extends First{
	static void oneFun()                        //method hiding
	{
		System.out.println("oneFun of Second");
	
	}

	void myFun()                        //method hiding
	{
		System.out.println("myFun of second");
	}
}

/*
/////private void myFun()   
D:\JAVA Workspace\Inheritance>java MethodHiding.java
Program Execute Successfully
Fun of First
myFun of First
oneFun of First

/////void myFun()
D:\JAVA Workspace\Inheritance>java MethodHiding.java
Program Execute Successfully
Fun of First
myFun of second
oneFun of First
*/
