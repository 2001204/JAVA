//binding
//compile time execute --> static
//runtime execute--> dynamic

class Binding
{
	   public static void main(String args[])
	{
       		 First f = new First();
		//f.myFun();        //dynamic bininding
       		 f.myFun(5);          //Static binding at compile time   early binding
		 

		Second s = new Second();          
       		 s.myFun();                  //dynamic binding

		First f1 = new Second();
       		 f1.myFun();                   //dynamic binding  late binding

		Second s1 = new Second();          
       		 s1.myFun(2); 

		First f2 = new First();
       		 f2.myFun(5.7);  //Static binding
    	}
}

class First{
    void myFun()
	{
	   	 System.out.println("myFun of  first");
 	}
    void myFun(int a)                            //overloaded method
	{
	   	 System.out.println("myFun(int a) of first");
 	}
void myFun(double a)                            //overloaded method
	{
	   	 System.out.println("myFun(double a) of first");
 	}
}

class Second extends First
{
    void myFun()              //overriding method
 	{
	   	 System.out.println("myFun of  Second");
 	}
 }


/*
D:\JAVA Workspace\Inheritance>java Binding.java
myFun(int a) of first
myFun of  Second
myFun of  Second
myFun(int a) of first
myFun(double a) of first

*/