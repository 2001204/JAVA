class CovariantDemo
{
 	public static void main( String args[ ])
   	{
		MyDemo md = new MyDemo();
		md.myFun();
	}
}
class First{
}

class Second extends First{
}

class Third extends Second{
}


class Demo
{
	First myFun()
	{
		System.out.println("myFun of Demo");
		return new First();
	}
	/*double anotherFun()
	{
	System.out.println("another of Demo");	
	return 5.3;
	}*/
}
class MyDemo extends Demo
{
	Third myFun()
	{
		System.out.println("myFun of MyDemo");
		return new Third();
	}
	/* int anotherFun()
	{
	System.out.println("another of MyDemo");	
	return 5;
	}*/
	
}
