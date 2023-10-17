class MethodInnerClassDemo
{
	public static MyClass myFun()
	{
		//we will define a inner class here just as we do in the normal class
		//Following class object can be created and used within this myFun function only.
		class MyClass
		{
			int a;
			int b;

			MyClass(int a, int b)
			{
				this.a = a;
				this.b = b;
			}

			void print()
			{
				System.out.println(" a = " + a + " b = " + b);
			}
		}

		MyClass mcls = new MyClass(5,10);
		mcls.print();
	}


	public static void main(String args[])
	{
		myFun();
	}
}
