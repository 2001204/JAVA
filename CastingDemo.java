
class CastingDemo{
 	public static void main( String args[ ])
   	{
		First f = new First();
		Second s = new Second(); 
		f = s;     //parennt = child
		f= new First();
		s = (Second)f ;    // child = parent casting not possible
		//error: incompatible types: First cannot be converted to Second
		s.anotherFun();
		
		System.out.println("Program Working Successfully");
	}
}

class First{
 void myFun(){

}

void anotherFun(){
	System.out.println("another of first");
	}
}
class Second extends First{

	void anotherFun(){
	System.out.println("another of second");
	}
}
class Third{
 	void myFun(){
	}
}

/* 
D:\JAVA Workspace\Inheritance>java CastingDemo.java
Program Working Successfully

*/
