
class InterfaceDemo
{
 	public static void main(String args[])
	{
	
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
/*

interface MyInterfaces3 extends MyInterface1, MyInterface
{
 	void fun3();      

}

*/
class Demo implements MyInterface2
{
 	//we will overide fun1 and fun2 here in class
	public void fun1(){
		//code
	}
public void fun2(){
		//code
	}

}
