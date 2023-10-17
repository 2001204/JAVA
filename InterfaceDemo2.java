
class InterfaceDemo2
{
 	public static void main(String args[])
	{
		//First t = new Third();           //okk
		Third t = new Third();      //okk
		t.fun1();
		t.myFun();
		
		Second s = new Second();      //okk
		s.myFun();
		
	}

}
interface MyInterface1
{
 	void fun1();

}
interface MyInterface2 extends MyInterface1
{
 	void fun2();

}

class First
{
	void myFun(){
		System.out.println("myFun of First");
	}

}

class Second extends First implements MyInterface1, MyInterface2
{

	public void fun1(){
		System.out.println("fun1 of second");
	}
	public void fun2(){
		System.out.println("fun2 of second");
	}

}

class Third extends Second
{
	//code
}

/*
D:\JAVA Workspace\Inheritance>java InterfaceDemo2.java
fun1 of second
myFun of First
myFun of First 
*/
