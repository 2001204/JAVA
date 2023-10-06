
class OveridingClassDemo{
	public static void main( String args[]){
		Third obj = new Third();
		obj.myFun( 5 );

		}
}

class First
{
	int val = 20;
	void myFun( int x )
	{
		System.out.println("myFunc of First class");
	}

}

class Second extends First
{
	int val = 30;
	void myFun( int x )
	{
		System.out.println("myFunc of Second class");
		super.myFun( 10 );   //it will call parent class myFun();
		System.out.println(super.val);
	}
}

class Third extends Second
{
	int val = 40;
	void myFun( int x )
	{
		System.out.println("myFunc of Third class");
		super.myFun( 10 );   //it will call parent class myFun();
		System.out.println(val);
		System.out.println(super.val);
	}
}

/*
D:\JAVA Workspace\Inheritance>java OverridingClassDemo.java
myFunc of Third class
myFunc of Second class
myFunc of First class
20
40
30


*/