class Pattern{
	public static void main(String args[])
	{
		int row=5;
		for(int i=0; i<row; i++)
			{
				for(int j=0; j<=i; j++)
					{
						System.out.print("* ");
					}
				System.out.println();
			}
	}
}

/*
D:\JAVA Workspace>java Pattern.java
*
* *
* * *
* * * *
* * * * *

*/