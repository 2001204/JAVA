class ParentRefChildObj{
	public static void main(String args[])
	{
		
  		First f= new Second();    //okk second is the object of first
		f.myFun();

	}

}

class First          
{

	void myFun(){  
	System.out.println("myFun of first");
	}
	
}

class Second extends First
{
	void myFun(){
		System.out.println("myFun of Second");
	}
	
}


/* 
D:\JAVA Workspace\Inheritance>java ParentRefChildObj.java
myFun of Second


*/