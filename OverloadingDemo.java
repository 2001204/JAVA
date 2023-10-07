//Mehod Overloading

class OverloadingDemo{
	public static void main(String args[]){
		AddCalculator cal= new AddCalculator();
		cal.add(5,2);	
		cal.add(2.4, 5.7);
		cal.add(2, 3.5);
	}

}

class AddCalculator
{	
	void add(int a ,int b)
	{
		System.out.println("add( int , int ) Method Called Here");
		System.out.println(a+b);	
	}	

	void add( double a ,double b)
	{
		System.out.println("add( double, double) Method Called Here");
		System.out.println(a+b);	
	}	
}
