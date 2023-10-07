class TwoDArray
{
	public static void main(String args[])
	{
		int arr[ ][ ] = {{ 5, 10, 15},{ 20, 25,30}};
/*
		int arr[ ] [ ] = new int [ 2 ] [ 3 ] ;    //dynamic 
		
		for(int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print(arr[i][j]+"\t"); //it will print 0's array
				/*
				0       0       0
				0       0       0
				*/
				/*
				//arr[ i ][ j ]= i + j;
				//System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
*/
		for(int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print(arr[i][j]+"\t"); 
			}
			System.out.println();
		}
	}
}

/*
D:\JAVA Workspace\Array>java TwoDArray.java
5       10      15
20      25      30

*/