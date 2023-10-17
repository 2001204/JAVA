class GenericUseDemo
{
	public static void main(String args[])           
	 {
		MyGen<Integer> mg1 = new MyGen<Integer> ( 100);
	
		MyGen<Integer> mg2 = new MyGen<Integer> ( 55 );
		
		MyGen<String> mg3 = new MyGen<String> ( "Welcome" );
		
		//mg1.myFun(100);
		mg1.myFun(mg2);
		//mg1.myFun(mg3);	
}
}

class MyGen <T>
{
	T ob;

	MyGen()
	{
		ob = null;
	}
	MyGen(Object ob)         //Object ob = Welcome  Object ob= 100
	{ 
 		this.ob = ob;
       }
		void myFun(MyGen<? extends Number> x)
	//void myFun(MyGen<T> x)
	{
		System.out.println("X "+ x);
	}
	String toSring()
	{
 		return ob.toString();
	
        }
}


