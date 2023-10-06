//final keyword use

public class FinalDemo
{
	public static void main( String args[]){

		//Final local Variable
		final int a;
		a= 10;
   		//a= 20;
		System.out.println("a = "+ a);
		System.out.println("------------------------");

		First f = new First();
		f.print();
		System.out.println("------------------------");

		Second s = new Second();
		s.print();
	}
}

//final class First
class First
{
	
	final int val = 10;
	First()
	{
		//val  = 0;      // error: cannot assign a value to final variable val
        
	}
	//final void print()    
	void print()
	{
		System.out.println("val = "+ val);
	}
}
class Second extends First           // error: cannot inherit from final First, if apply with final keyword
{
	int  N = 20;

	void print()        // error: print() in Second cannot override print() in First overridden method is final
	{ 
		super.print();
		System.out.println("Number = "+N);
	}

}

/*
D:\JAVA Workspace\Classobject>java FinalDemo.java
a = 10
------------------------
val = 10
------------------------
val = 10
Number = 20
==============
error: cannot assign a value to final variable val
                val  = 0;
                ^
error: print() in Second cannot override print() in First
        void print()
             ^
  overridden method is final


 error: cannot inherit from final First
class Second extends First
                     ^
*/