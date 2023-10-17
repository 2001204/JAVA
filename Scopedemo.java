class Scopedemo{
	public static void myFun()
	{
		int a=10;
		System.out.println(a);
	}
	public static void main (String agrs[])
	{
		myFun();
		//System.out.println(a);	
//error due to a can't use in this main function
	}
}