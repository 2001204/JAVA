// hashcode() method
class OverriddenObjClass
{
 	public static void main( String args[ ])
   	{
		First f1= new First(10,20);
		First f2 = new First(10,20);

		//boolean equal();
		if(f1.equals(f2)){
               System.out.println("f1 and f2 are not equal");   
                }
		else 
		{
               System.out.println("F1 and f2 are not equals");   
  
		}

		//int hashcode()
		System.out.println("HashCode of F1: " + f1.hashCode() );

		System.out.println("HashCode of F1: " + f2.hashCode() );   

		//String toString()
		System.out.println("f1.toString()):  "+ f1.toString());
		System.out.println("f2.toString()):  "+ f2.toString());
		System.out.println(f2);
		
		if ( f1 == f2 )     //shllow caomparison
		{
			System.out.println(" f1 == f2 ");
		}
		else
		{		
			System.out.println(" f1 != f2 ");
		}
	}
}

class First{

	int a;
	int b;
	First()
	{
	
	}
	First( int a, int b)
	{
 	this.a =a;
 	this.b = b;	
	}

	public int hashCode(){
		return (a+b);

	}
	public boolean equals( Object obj)
	{
	First f = ( First ) obj;
	//this.a;
	//f.a;
	if ( this.a ==  f.b && this.b == f.b)
		return true;
	else
		return false;
	}
	
	public String toString()
	{
		String str = "First [a = "  +a+ ", b = " +b+ "]";
		return str;
	}	

}
/*
D:\JAVA Workspace\Classobject>java OverriddenObjClass.java
F1 and f2 are equals
HashCode of F1: 30
HashCode of F1: 30
f1.toString()):  First [a = 10, b = 20]
f2.toString()):  First [a = 10, b = 20]
First [a = 10, b = 20]
 f1 != f2

*/




