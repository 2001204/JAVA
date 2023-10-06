// Array of object

class ArrayofObject{
	public static void main(String args[])
	{
	
		Student Stud[ ] = new Student[ 5 ]; 
		Stud[ 0 ] = new Student( 1, 88.80 );
		Stud[ 0 ].printDetails();
		System.out.println("------------------------------------");
		//initializes array
		for( int i = 0; i < Stud.length; i++ ){
			Stud[ i ] = new Student ( i + 1, 80.50);
		}
		//Print array
		for( int i = 0; i < Stud.length; i++ ){
			Stud[ i ].printDetails();
		}
 	}
}

class Student{
	int roll;
	double marks;

	Student(){
	
	}

	Student(int roll ,double marks){
		this.roll = roll;
		this.marks = marks;
 	}
		
	void printDetails(){
		System.out.println(this.roll+", " + this.marks);
	}
	
}

/*
D:\JAVA Workspace\Array>java ArrayofObject.java
1, 88.8
------------------------------------
1, 80.5
2, 80.5
3, 80.5
4, 80.5
5, 80.5

*/
