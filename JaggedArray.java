class JaggedArray{
	public static void main ( String args[] )
	{
		int arr[ ] [ ] =  { { 5,10}, {15,20,25},{30}};
/*		
		int arr[ ] [ ] = new int [ 3 ]  [ ];	
		arr[ 0 ] = new int [ 2 ]; 
		arr[ 1 ] = new int [ 3 ];
		arr[ 2 ] = new int [ 1 ];	
		//input
		for(int i= 0; i< 3; i++)
		{
			for( int j = 0; j < arr[i].length ; j++)
			{
			 	//System.out.print(arr[i][j]+ "  " );
				arr[i][j]= i+j;
				System.out.print(arr[i][j]+ "  ");		
			}
			System.out.println( );
		}
*/
		//PRINT
		for (int i = 0; i < 3; i++)
		{
			for (int  j= 0; j< arr[i].length; j++)
			{
				System.out.print(arr[ i ][ j ] +" \t ");
			}
			System.out.println( );
		}
	
	}

}
/*
D:\JAVA Workspace\Array>java JaggedArray.java
5        10
15       20      25
30

*/