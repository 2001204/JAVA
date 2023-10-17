

class ConstructorChainingDemo
{
	public static void main(String args[])
	{
		Student stud1 = new Student(1,78.5);
		stud1.printDetails();

		new Student(2,74.5,"Mohit").printDetails();

	}
}

class Student
{
	int roll;
	double marks;
	String name;
	String mobNo;

	Student()
	{
		//this();		//Compilation error: recursive constructor invocation
		System.out.println("zero-arg constructor called");
	}

	Student(int roll)
	{
        this();
		System.out.println("one-arg constructor called");
		this.roll = roll;
	}

	Student(int roll, double marks)
	{
        this(roll);	//It will call one-arg constructor of Student.
		System.out.println("two-arg constructor called");
		this.marks = marks;
	}

	Student(int roll, double marks, String name)
	{
        this(roll,marks);
		System.out.println("three-arg constructor called");
		this.name = name;
	}

	Student(int roll, double marks, String name, String mobNo)
	{
        this(roll,marks,name);
		System.out.println("four-arg constructor called");
		this.mobNo = mobNo;
	}

	void printDetails()
	{
		System.out.println(this.roll);
		System.out.println(this.marks);
		this.printOtherDetails();
	}

	void printOtherDetails()
	{
		System.out.println(this.name);
		System.out.println(this.mobNo);
	}


}



