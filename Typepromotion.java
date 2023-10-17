class Typepromotion 
{
	public static void main( String args[])
	{
		int a= 5;
		short b=10;
		long c=15;
		
		int result=  (int ) (a + b + c);		
		System.out.println( result );

		System.out.println("------------------------------------------------");
	
		int p=125;
		int q= 30;
		
		byte r= ( byte ) ( p + q );
		System.out.println( r );

	}
}