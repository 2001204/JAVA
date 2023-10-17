class ObjectClassNonGenericDemo
{
	public static void main(String args[])           
	 {
		MyNonGen mg1 = new MyNonGen ( 100);
		int a = (Integer)mg1.getOb();      
		System.out.println("Integer : " + a);	
		
		MyNonGen mg2 = new MyNonGen ( 55.3);
		double d = (Double)mg2.getOb();       
		System.out.println("Double : "+d);
		
		MyNonGen mg3 = new MyNonGen ( "Welcome" );
		String s = (String)mg3.getOb();       
		System.out.println("String : "+s);

		First f1 = new First();
		MyNonGen mg4 = new MyNonGen ( f1 );
		First f = (First)mg4.getOb();       
		System.out.println("First Class OBJ: "+ f);

		mg1 = mg3;
		a = (Integer)mg1.getOb();      
		System.out.println("Integer : " + a);  
                //java.lang.ClassCastException: class java.lang.String    cannot be cast to class java.lang.Integer 	
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

class MyNonGen     
{
	
	Object ob;

	MyNonGen()
	{
		ob = null;
	}
	MyNonGen(Object ob)         //Object ob = Welcome  Object ob= 100
	{ 
 		this.ob = ob;
	}
	Object getOb()
	{
		return ob;
	}
}


/*
PS D:\JAVA Workspace\Generics> java ObjectClassGenericDemo.java
Integer : 100
Double : 55.3
String : Welcome
First Class OBJ: First@61009542
*/

