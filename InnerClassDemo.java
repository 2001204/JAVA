class InnerClassDemo
{
	public static void main(String args[])
	{
		Batsman bat1 = new Batsman(5000,120);
		bat1.printAvg();
		
		//To create inner class object we must have a parent class object first
		Batsman.AvgCalculator batAvg = bat1.new AvgCalculator(); 
		System.out.println("Batsman average is : " + batAvg.getAvg());
		
		Batsman.MyInnerClass innerObj = new Batsman.MyInnerClass();
		innerObj.myInnerFun();
		
	}
}



class Batsman
{
	private int totRuns;
	int totMatches;
	
	Batsman()
	{
	}
	
	Batsman(int totRuns, int totMatches)
	{
		this.totRuns = totRuns;
		this.totMatches = totMatches;
	}

	//Outer class can access inner class members through the inner class object only.
	void printAvg()
	{
		//int res = getAvg();			//error
		AvgCalculator avgCal = new AvgCalculator();
		int res = avgCal.getAvg();
		System.out.println("Avg is " + res);
	}
		
	class AvgCalculator	//we can use with it public,private,protected or default access specifier
	{
		int getAvg()
		{
			//Inner class has access to all the members of the outer class.
			int res =  totRuns/totMatches;
			return res;
		}
	}
	
	static class MyInnerClass
	{
		void myInnerFun()
		{
			System.out.println("myInnerFun() of MyInnerClass");
		}	
	}
	
	
}

/*
D:\JAVA Workspace\Miscellaneous>java InnerClassDemo.java
Avg is 41
Batsman average is : 41
myInnerFun() of MyInnerClass
*/
