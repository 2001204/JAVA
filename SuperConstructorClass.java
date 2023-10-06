//super constructor call


public class SuperConstructorClass
{
	public static void main( String args[]){

		Second s = new Second();
		s.print();
		System.out.println("------------------------------------------------------ ");
		Second s1 = new Second(20,30);
		s1.print();
	}
}

class First{
	
	private int a;
	First()
	{
		System.out.println("Zero Argument Constructor of First Class ");
		a = 5;
	}
	First( int a)
	{
		System.out.println("One Argument Constructor of First Class ");
		this.a = a;
	}
	void print()
	{
		System.out.println("a = "+ a);
	}
}
class Second extends First
{
	int b;

	Second()
	{
		System.out.println("Zero Argument Constructor of Second Class ");
		b = 10;
	}	
	Second(int a, int b)
	{
		super(20);
		System.out.println("Two Argument Constructor of Second Class ");
		this.b = b;
	}	
	void print()
	{
		super.print();
		System.out.println("b = "+b);
	}

}


/*

D:\JAVA Workspace\Classobject>java SuperConstructorClass.java
Zero Argument Constructor of First Class
Zero Argument Constructor of Second Class
a = 5
b = 10
------------------------------------------------------
One Argument Constructor of First Class
Two Argument Constructor of Second Class
a = 20
b = 30

*/