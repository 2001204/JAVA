class LoopPattern
{
	public static void main( String args[])
	{
		outer: for( int i= 1; i<=5; i++) 
		{
			inner: for ( int j = 5; j>= i; j--)
			{	
				
				if (j < i){                    // if ( j ==1 ) also can write 					
					break inner;
				}
				else System.out.print( j+ " \t " );
			}
			System.out.println("\n");
		}

	}

}

/*
D:\JAVA Workspace>java LoopPattern.java
5        4       3       2       1

5        4       3       2

5        4       3

5        4

5
*/