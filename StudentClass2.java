class Student
{
	int rollNo = 1;
	int age = 20;
	double marks = 25.0;

	public void getdetails( int a, int b, double c)
	{
		rollNo = a;
		age = b;
		marks = c;
	}

	public void displaydetails()
	{
		System.out.println("Roll No  :  " + rollNo);
		System.out.println("Age  :  "+ age);
		System.out.println("Marks  :  "+ marks);
	}

	public static void main (String[] args)
	{
		Student Stud1;
		Stud1 = new Student();
		System.out.println("Student 1 details: ");
		Stud1.getdetails(1,22,88.23);
		Stud1.displaydetails();
		System.out.println("---------------------------------");

		Student Stud2;
		Stud2 = new Student();
		System.out.println("Student 2 details: ");
		Stud2.getdetails(2,25,78.22);
		Stud2.displaydetails();

	/*	Student Stud1;
		Student Stud2;

		Stud1 = new Student();
		Stud2 = new Student();

		Stud1.getdetails(1,22,88.23);
		Stud2.getdetails(2,25,78.22);

		System.out.println("Student 1 details: ");
		Stud1.displaydetails();

		System.out.println("---------------------------------");

		System.out.println("Student 2 details: ");
		Stud2.displaydetails();
	*/

	}
}

/*
D:\JAVA Workspace\Classobject>java StudentClass2.java
Student 1 details:
Roll No  :  1
Age  :  22
Marks  :  88.23
---------------------------------
Student 2 details:
Roll No  :  2
Age  :  25
Marks  :  78.22
*/