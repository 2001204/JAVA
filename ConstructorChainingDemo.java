class ConstructorChaningDemo{
	public static void main(String args[]){
		Student Stud1= new Student();
		Stud1.printDetails();
		Student Stud2= new Student(1,88.5);
		Stud2.printDetails();
		new Student(1).printDetails();
		new Student(1,88.5,"Dipak").printDetails();
		new Student(1,88.5,"Dipak", "8888888888").printDetails();
	}
}

class Student{
		int rollno;
		double marks;
		String name;
		String mbno;

	Student(){
		System.out.println(" Here Zero arg Constructor called ;");
	}
	Student(int rollno){
		this();
		System.out.println(" One- arg Constructor called ;");
		this.rollno = rollno;
	}
	Student(int rollno, double marks){
		this(rollno);       //here call goes to one arg constructor.
		System.out.println("Two arg Constructor called ;");
		this.marks = marks;
	}
	Student(int rollno, double marks, String name){
		this(rollno, marks);
		System.out.println(" Three arg Constructor called ;");
		this.name = name;
	}
	Student(int rollno, double marks, String name, String mbno){
		this(rollno, marks, name);
		System.out.println("Four arg Constructor called ;");
		this.mbno = mbno;
	}
	void printDetails(){
		System.out.println(this.rollno);
		System.out.println(this.marks);
		System.out.println(this.name);
		System.out.println(this.mbno);
	}
}

/*
D:\JAVA Workspace\Classobject>java ConstructorChainingDemo.java
 Here Zero arg Constructor called ;
0
0.0
null
null
 Here Zero arg Constructor called ;
 One- arg Constructor called ;
Two arg Constructor called ;
1
88.5
null
null
 Here Zero arg Constructor called ;
 One- arg Constructor called ;
1
0.0
null
null
 Here Zero arg Constructor called ;
 One- arg Constructor called ;
Two arg Constructor called ;
 Three arg Constructor called ;
1
88.5
Dipak
null
 Here Zero arg Constructor called ;
 One- arg Constructor called ;
Two arg Constructor called ;
 Three arg Constructor called ;
Four arg Constructor called ;
1
88.5
Dipak
8888888888

*/