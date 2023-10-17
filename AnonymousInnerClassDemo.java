interface MyInterface
{
	void fun1();
	void fun2();
}



/*class Demo implements MyInterface
{
	public void fun1()
	{
		System.out.println("fun1 called");
	}

	public void fun2()
	{
		System.out.println("fun2 called");
	}
}*/

class AnonymousInnerClassDemo
{
	public static void myFun()
	{
		//MyInterface mif = new Demo();

		//MyInterface mif = new MyInterface(){}; 	//Basic structure of anonymous inner class

		MyInterface mif = new MyInterface(){		//Implementation + Object creation
			public void fun1()
			{
				System.out.println("fun1 of anonymous inner class");
			}

			public void fun2()
			{
				System.out.println("fun2 of anonymous inner class");
			}
		};

		mif.fun1();
		mif.fun2();
	}


	public static void main(String args[])
	{
		myFun();
	}
}
