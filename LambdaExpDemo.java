interface AddCalculator
{
	int add(int a, int b);
}

class LambdaExpDemo
{
	public static void main(String args[])
	{
		int sum;

		//Anonymous inner class implemntation for AddCalculator
		AddCalculator ac1 = new AddCalculator(){
			public int add(int a, int b) { return a + b ;}
		};
		
		sum = ac1.add(5,10);
		System.out.println("sum = " + sum);

		//Implementation using Lambda Expression for AddCalculator
		//1st way
		AddCalculator ac2 = (int a, int b) -> {return a + b;};
		sum = ac2.add(10,25);
		System.out.println("sum = " + sum);

		//2nd way
		AddCalculator ac3 = (a, b) -> {return a + b;};
		sum = ac3.add(15,25);
		System.out.println("sum = " + sum);

		//3rd way
		AddCalculator ac4 = (a, b) -> a + b;	//will automatically return the value of a+b
		sum = ac4.add(35,25);
		System.out.println("sum = " + sum);


		//multiple statement: curly bracket is must.
		AddCalculator ac5 = (int a, int b) -> { int s; 
			s = a + b ; 
			return s;
		};
		sum = ac5.add(35,45);
		System.out.println("sum = " + sum);
	}
}





