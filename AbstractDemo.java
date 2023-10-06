class AbstractDemo{
	public static void main(String args[])
{
		//new First();   //can't create object due to abstract class
  		Second s= new Second();
		s.myFun();
		s.anotherFun();
}

}

//class First           //concreate class
abstract class First                          //abstract class
{
	//abstract void myFun();    
// First is not abstract and does not override abstract method myFun() in First

	void myFun(){  
	}
	void anotherFun()
	{

	System.out.println("AnotherFun of first");
	}
}

class Second extends First
{
	void myFun(){
		System.out.println("myFun of Second");
}
	
}


/*
D:\JAVA Workspace\Inheritance>java AbstractDemo.java
myFun of Second
AnotherFun of first

*/
