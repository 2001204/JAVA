class GenericDemo
{
	public static void main(String args[])           
	 {
		MyGen<Integer> mg1 = new MyGen<Integer> ( 100);
		int a = mg1.getOb();       //int =Integer , due to autounboxing
		System.out.println("Integer : " + a);	
		
		MyGen<Double> mg2 = new MyGen<Double> ( 55.3);
		double d = mg2.getOb();       
		System.out.println("Double : "+d);
		
		MyGen<String> mg3 = new MyGen<String> ( "Welcome" );
		String s = mg3.getOb();       
		System.out.println("String : "+s);

		First f1 = new First();
		MyGen<First> mg4 = new MyGen<First> ( f1 );
		First f = mg4.getOb();       
		System.out.println("First Class OBJ: "+ f);
	}
}

class First
{
		int val =10 ;
		/*
		public String toString()
		{
			return "Firrst[val=" + val +"]";
		}
		*/

}

class MyGen <T>    //T is type parameter 
{
	
	T ob;

	MyGen()
	{
		ob = null;
	}
	MyGen(T ob)
	{
 		this.ob = ob;
	}
	T getOb()
	{
		return ob;
	}
}


/*

D:\JAVA Workspace\Generics>java GenericDemo.java
100
55.3
Welcome
First@176d53b2

D:\JAVA Workspace\Generics>java GenericDemo.java
Integer : 100
Double : 55.3
String : Welcome
First Class OBJ: Firrst[val=10]

*/