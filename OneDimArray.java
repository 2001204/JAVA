class OneDimArray
{
	public static void main(String args[])
	{
		//int arr[] = {5,10,15,20,25};
		
		int arr[] = new int[5];

		for(int i = 0; i < 5; i++)
		{
			arr[i] = i + 2; 
		}

		for(int i = 0; i < 5; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
