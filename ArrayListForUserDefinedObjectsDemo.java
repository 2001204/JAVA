import java.util.*;

class ArrayListForUserDefinedObjectsDemo
{
	static void display(Collection<?> c)
     	       {
				if (c == null) return;
           	     	for(Object ob : c)
               		 {
                        	System.out.println(ob);
               		 }
        		}
        
	    public static void main(String args[])
    	   {
		 		List<Student>studList = new ArrayList<Student>();
                
				Student s1 = new Student(1, "Dipak", 22);
		  		Student s2 = new Student(2, "Ram", 21);
		
				studList.add(s1);
				studList.add(s2);
				studList.add(new Student(3, "Dips", 22));
				studList.add(new Student(4, "Gayu", 25));
				studList.add(new Student(5, "Harry", 23));
            	//displaying student list
				display(studList);
			
				//contains()
				boolean boolres=  studList.contains(s1);	
				System.out.println("Is S1 exist in Studlist "+ boolres);
System.out.println("-----------------------------------------");
				Student s = new Student(2, "Ram", 21);
				boolres=  studList.contains(s);
				System.out.println("Is S exist in Studlist "+ boolres);
System.out.println("-----------------------------------------");
				//containsAll()
				List<Student>studList1 = new ArrayList<Student>();
				Student s3 = new Student(3, "Dips", 22);
				studList1.add(s3);
				studList1.add(new Student(4, "Gayu", 25));
				studList1.add(new Student(5, "Harry", 23));
				display(studList1);

				boolean boolres1 = studList.containsAll(studList1) ;
				System.out.println("Is studList.ContainsAll(studList1) :  "+ boolres1);
 System.out.println("-----------------------------------------");
				//remove()
				studList1.remove(s3);
				System.out.println("studlilst after removing s3 : ");
				display(studList1);
System.out.println("-----------------------------------------");
				//removeAll()
				
				//retainAll()
				studList1.retainAll(studList);
				System.out.println("studList1.retainAll(studList); : ");
				display(studList1);
System.out.println("-----------------------------------------");
				//sorting
				Collections.sort(studList);
				System.out.println("studList after sorting: ");
				display(studList);
System.out.println("-----------------------------------------");
				//sorting in revers order
				Collections.sort(studList, Collections.reverseOrder());
				System.out.println("studList after sorting in reverse order: ");
				display(studList);
System.out.println("-----------------------------------------");
				//sorting using AgeComparator
				StudentAgeComparator ageComp = new StudentAgeComparator();
				Collections.sort(studList, ageComp);
				System.out.println("studList after sorting based on age : ");
				display(studList);
System.out.println("-----------------------------------------");
				//sorting based on reverse order based on age.
				Collections.sort(studList, Collections.reverseOrder(ageComp));
				System.out.println("studList after sorting in reverse order of age : ");
				display(studList);
System.out.println("-----------------------------------------");
				//sorting based on name
				StudentNameComparator nameComp = new StudentNameComparator();
				Collections.sort(studList,nameComp);
				System.out.println("studList after sorting based on name: ");
				display(studList);
System.out.println("-----------------------------------------");
         	}
}

class Student implements Comparable<Student>
{

	int rollNo;
	String name;
	int age;

	Student()
	{

	}
	Student(int rollNo, String name, int age)
	{
 		this.rollNo = rollNo;
		this.name = name;
		this.age = age;

	}

	public boolean equals(Object obj)
	{
		if (obj == null ) return false;
		
		Student s = (Student ) obj;
		if (this.rollNo == s.rollNo && this.name.equals(s.name) && this.age == s.age )
		{
			return true;
		}
		return false;
	}

	public int compareTo(Student s)
	{
		if (this.rollNo == s.rollNo) return 0;
		if (this.rollNo < s.rollNo) return -1;
		if (this.rollNo > s.rollNo) return 1; 
		return 0;

	}	

	public String toString()
	{
		return "Student [Roll ="+ rollNo+ ", name = " + name+ ", age = "+ age+ "]" ;
	}
}

class StudentAgeComparator implements Comparator<Student>
{
	public int compare (Student s1, Student s2)
	{
		if(s1.age == s2.age) return 0;
		if(s1.age < s2.age) return -1;
		if(s1.age > s2.age) return 1;

		return 0;

		//return s1.age - s2.age;
	}
}
class StudentNameComparator implements Comparator<Student>
{
	public int compare (Student s1, Student s2)
	{
		return s1.name.compareTo(s2.name);	
	}
}


/*
D:\JAVA Workspace\CollectionFramework>java ArrayListForUserDefinedObjectsDemo.java
Student [Roll =1, name = Dipak, age = 22]
Student [Roll =2, name = Ram, age = 21]
Student [Roll =3, name = Dips, age = 22]
Student [Roll =4, name = Gayu, age = 25]
Student [Roll =5, name = Harry, age = 23]
Is S1 exist in Studlist true
-----------------------------------------
Is S exist in Studlist true
-----------------------------------------
Student [Roll =3, name = Dips, age = 22]
Student [Roll =4, name = Gayu, age = 25]
Student [Roll =5, name = Harry, age = 23]
Is studList.ContainsAll(studList1) :  true
-----------------------------------------
studlilst after removing s3 :
Student [Roll =4, name = Gayu, age = 25]
Student [Roll =5, name = Harry, age = 23]
-----------------------------------------
studList1.retainAll(studList); :
Student [Roll =4, name = Gayu, age = 25]
Student [Roll =5, name = Harry, age = 23]
-----------------------------------------
studList after sorting:
Student [Roll =1, name = Dipak, age = 22]
Student [Roll =2, name = Ram, age = 21]
Student [Roll =3, name = Dips, age = 22]
Student [Roll =4, name = Gayu, age = 25]
Student [Roll =5, name = Harry, age = 23]
-----------------------------------------
studList after sorting in reverse order:
Student [Roll =5, name = Harry, age = 23]
Student [Roll =4, name = Gayu, age = 25]
Student [Roll =3, name = Dips, age = 22]
Student [Roll =2, name = Ram, age = 21]
Student [Roll =1, name = Dipak, age = 22]
-----------------------------------------
studList after sorting based on age :
Student [Roll =2, name = Ram, age = 21]
Student [Roll =3, name = Dips, age = 22]
Student [Roll =1, name = Dipak, age = 22]
Student [Roll =5, name = Harry, age = 23]
Student [Roll =4, name = Gayu, age = 25]
-----------------------------------------
studList after sorting in reverse order of age :
Student [Roll =4, name = Gayu, age = 25]
Student [Roll =5, name = Harry, age = 23]
Student [Roll =3, name = Dips, age = 22]
Student [Roll =1, name = Dipak, age = 22]
Student [Roll =2, name = Ram, age = 21]
-----------------------------------------
studList after sorting based on name:
Student [Roll =1, name = Dipak, age = 22]
Student [Roll =3, name = Dips, age = 22]
Student [Roll =4, name = Gayu, age = 25]
Student [Roll =5, name = Harry, age = 23]
Student [Roll =2, name = Ram, age = 21]
-----------------------------------------
*/