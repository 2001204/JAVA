
class BlockDemo{
public static void main( String args[]){

		Demo.myFun();

		System.out.println("Creating first object");
		Demo d1 =new Demo();	
		d1.print();

		System.out.println("Creating second object");
		new Demo();
		System.out.println("Creating second object");
	}
}

class Demo{
	int a = 2;
	static int b;
	
	Demo(){
		System.out.println("Zero -arg Consructor");
		a=10;
		
	}	
	static{
		System.out.println(" non static block");
		b=20;
		anotherFun(); 
	}
	{
		System.out.println(" non static block");
		a= 5;
		print( ); 
	}
	static void myFun(){
		System.out.println(" myFun of Demo");
	}
	static void anotherFun(){
		System.out.println(" anotherFun of Demo");
	}
	
	void print(){
		System.out.println(" a " + a );
	}

}


/* 
D:\JAVA Workspace\Classobject>java BlockDemo.java
 non static block
 anotherFun of Demo
 myFun of Demo

Creating first object
 non static block
 a 5
Zero -arg Consructor
 a 10

Creating second object
 non static block
 a 5
Zero -arg Consructor

*/