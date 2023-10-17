class Return 
{
	public static void myFun( int a)
	{
		int result = a + 5;
		if( result < 10 )
		{s
			return;	
		}
		System.out.println(result);
	}
	public static void main( String args[])
	{
		myFun( 10 );
	}

}