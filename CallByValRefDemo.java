class CallByValRefDemo
{
	public static void main(String args[])
	{

		int a = 5;
		int b = 10;
		System.out.println("Call By Value :- ");
		Demo.myFun(a,b);
		System.out.println(a);		//5
		System.out.println(b);		//10
		System.out.println("---------------------------------");

		System.out.println("Call By Reference :- ");
		First f = new First();
		f.val = 5;
		//First f1 = Demo.anotherFun(f);
		First f1 = Demo.anotherFun(new First());
		System.out.println(f1.val);	//25
	}
}

class First
{
	int val;

}

class Demo
{
	static void myFun(int x, int y)
	{
		x = x + 2;                       //7      //call by value
		y = y + 2;                      //12
		System.out.println(x);
		System.out.println(y);
	}

	static First anotherFun(First fst)
	{
		System.out.println(fst.val);       //call by reference
		fst.val = 25;
		return fst;
	}
}

/*

D:\JAVA Workspace\Classobject>java CallByValRefDemo.java
Call By Value :-
7
12
5
10
---------------------------------
Call By Reference :-
0
25
*/