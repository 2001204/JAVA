import java.lang.reflect.*;

class MyClass
{
	private int a;
	public int b;
	static int c;

	MyClass()
	{
		System.out.println("Zero Argument Constructor");
	}

	MyClass(int a, int b)
	{
		System.out.println("Two Argument Constructor");
		this.a = a;
		this.b = b;
	}

	private void myFun1()
	{
		System.out.println("private method myFun1 of MyClass");
	}

	public void myFun2()
	{
		System.out.println("public method myFun2 of MyClass");
	}

	private void myFun3(int x, double y)
	{
		System.out.println("private method myFun3 of MyClass");
	}
	
	static private void myFun4()
	{
		System.out.println("private static method myFun4 of MyClass");
	}

}


class ReflectionAPIDemo
{
	public static void main(String args[]) throws Exception
	{
		MyClass myObj1 = new MyClass(5,10);
		
		//Getting Class object to MyClass
		//Class clsObj = myObj1.getClass();
		Class clsObj = MyClass.class;
		
		System.out.println("myObj1 is the object of "+ myObj1.getClass().getName());
		
		Method[] methods = clsObj.getMethods();
		
		System.out.println("------ Methods ------");
		for(Method m : methods)
		{
			System.out.println(m.getName());
		}
		
		System.out.println("------ Fields ------");
		Field[] fields = clsObj.getFields();
		for(Field f : fields)
		{
			System.out.println(f.getName());
		}
		
		System.out.println("------ Invoking a private method myFun3 from outside class ------");
		Method m1 = clsObj.getDeclaredMethod("myFun1");
		m1.setAccessible(true);
		m1.invoke(myObj1);	//call myObj1.myFun1()
		
		Method m2 = clsObj.getDeclaredMethod("myFun3",int.class,double.class);
		m2.setAccessible(true);
		m2.invoke(myObj1,10,15.6);	//call myObj1.myFun3(10,15.6)
		
		Method m4 = clsObj.getDeclaredMethod("myFun4");
		m4.setAccessible(true);
		//m4.invoke(myObj1);	//call myObj1.myFun4()
		m4.invoke(MyClass.class);	//call MyClass.myFun4()
		
	}
}
