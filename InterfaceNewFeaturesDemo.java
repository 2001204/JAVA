interface MyInterface
{
	static void myFun()
	{
		System.out.println("static myFun of MyInterface");
	}

	default void anotherFun()	//default is not access specifier here. 
	{
		System.out.println("default implemented method anotherFun of MyInterface");
	}

	void oneFun();

	/* In java 9
	private void secondFun()		//here private is access specifier
	{
	}

	static private void thirdFun()
	{
	} */
}

class MyClass implements MyInterface
{
	public void oneFun()
	{
		System.out.println("oneFun of MyClass");
	}

	public void anotherFun()
	{
		System.out.println("overridden default method anotherFun from MyInterface");
	}
}


class InterfaceNewFeaturesDemo
{
	public static void main(String args[])
	{
		MyClass myObj = new MyClass();
		MyInterface.myFun();
		myObj.anotherFun();
		myObj.oneFun();
	}
}
