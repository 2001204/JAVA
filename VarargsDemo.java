class VarargsDemo
{
	/*static void add(int a, int b)
	{
		int res =  a+b;
		System.out.println(res);
	}

	static void add(int a, int b, int c)
	{
		int res =  a+b+c;
		System.out.println(res);
	}*/

	static void add(int... arr)		//int... arr => int arr[]
	{
		int sum = 0;
		for(int a : arr)
		{
			sum = sum + a;		//sum += a;
		}
		System.out.println(sum);
	}

	static void arithOp(String opr,int... arr)
	{
		int res = 0;
		int s = 0;
		int m = 1;

		for(int a : arr)
		{
			if(opr.trim().equalsIgnoreCase("sum"))
			{
				s = s + a;
				res = s;
			}
			if(opr.trim().equalsIgnoreCase("mult"))
			{
				m = m * a;
				res = m;
			}
		}
		System.out.println(res);
	}
	

	public static void main(String... args)
	{
		add(5,7);
		add(5,6,8);
		add(4,5,6,7);

		arithOp("sum",5,7,8);
		arithOp("mult",5,7);
	}
}
