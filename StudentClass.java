class Student
{
	int rollNo = 1;
	int age = 20;
	double marks = 25.0;	

	public static void main (String[] args)
	{
		Student stud1;
		stud1 = new Student();
		
		stud1.rollNo = 1;
		stud1.age = 21;
		stud1.marks = 78.5; 

		System.out.println("Student1 details:");
		System.out.println(stud1.rollNo);
		System.out.println(stud1.age);
		System.out.println(stud1.marks);
		
		Student stud2;
		stud2 = new Student();
		
		/*stud2.rollNo = 2;
		stud2.age = 23;
		stud2.marks = 74.5; */

		System.out.println("Student2 details:");
		System.out.println(stud2.rollNo);
		System.out.println(stud2.age);
		System.out.println(stud2.marks);
	}
}
