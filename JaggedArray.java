class JaggedArray
{
	public static void main(String args[])
	{
		//int arr[][] = {{5,10},{15,20,25},{30}};

		int arr[][] = new int[3][];

		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[1];	

		//INPUT to array
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = i + j;
			}
		}

		//Print

		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
