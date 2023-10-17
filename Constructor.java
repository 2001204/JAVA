

class Constructor{
	public static void main(String args[])
	{
		Student stud1 = new Student(1,78.5);
		stud1.printDetails();

		new Student(2,74.5,"Dipak").printDetails();
		new Student(2,74.5,"Dipak","8888888888").printDetails();

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
		this.printDetails();
	}

	Student(int roll)
	{
        this();
		System.out.println("one-arg constructor called");
		this.roll = roll;
		this.printDetails();
	}

	Student(int roll, double marks)
	{
        this(roll);	//It will call one-arg constructor of Student.
		System.out.println("two-arg constructor called");
		this.marks = marks;
		this.printDetails();
	}

	Student(int roll, double marks, String name)
	{
        this(roll,marks);
		System.out.println("three-arg constructor called");
		this.name = name;
		this.printDetails();
	}

	Student(int roll, double marks, String name, String mobNo)
	{
        this(roll,marks,name);
		System.out.println("four-arg constructor called");
		this.mobNo = mobNo;
		this.printDetails();
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



