class TwoDimArray
{
	public static void main(String args[])
	{
		//int arr[][] = {{5,10,15},{20,25,30}};
		
		int arr[][] = new int[2][3];

		//Put some value in array

		for(int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				arr[i][j] = i+j;
			}
		}

		//Print array

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
