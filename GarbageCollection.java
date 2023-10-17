class GarbageCollection
{
    public static void main(String [] args)
    {
        First f1 = new First();
        Second s1= new Second();
   		f1.s = s1;
   		s1.f = f1;

   		//f1 = s1  //error as therre is no inheritance relationship btw first and second
   		f1 = new First();
		s1= new Second();
		System.out.println("Program working successfully");
   }
}

class First
{
	int a;
	int b;
	Second s;



class Second
{
	int x;
	First f;
}

/*

D:\JAVA Workspace\Inheritance>java GarbageCollection.java
Program working successfully

*/