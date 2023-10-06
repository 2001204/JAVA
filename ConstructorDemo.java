// Constructor Demo

class ConstructorDemo
{
	public static void main(String args[])
	{
		Employee emp1 = new Employee(1,202000);
		emp1.printDetails();

		//Employee emp2 = new Employee(2,31020);
		Employee emp2 = new Employee();
		emp2.printDetails();
	}
}

class Employee
{
	int id;
	double salary;
	//zero-argument constructor
	Employee()
	{
		System.out.println("zero-arg constructor called");
		id = 0;
		salary = 0.0;
	}

	//Two-argument constructor
	Employee(int id, double salary)
	{
		System.out.println("two-arg constructor called");
		this.id = id;	//instance id = local id
		this.salary = salary;	//instance salary = local salary
	}

	void printDetails()
	{
		System.out.println(this.id + "\t" + this.salary);
	}
}




/*


D:\JAVA Workspace\Classobject>java ConstructorDemo.java
two-arg constructor called
1       202000.0
zero-arg constructor called
0       0.0
*/
