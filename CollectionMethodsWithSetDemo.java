import java.util.*;
class CollectionMethodsWithSetDemo
{

	static void display(Set <String>mySet)
	{
		for(String s: mySet)
		System.out.println("HashSet : "+ s );
	}
	public static void main (String args[])		
	{
		Set<String> mySet  = new HashSet<String>();
		
		//add() method
		mySet.add("Hello");
		mySet.add("Dipak");
		mySet.add("Gayu");
		mySet.add("Ram");
		mySet.add("Harry");
		mySet.add("Byyee");
		
		//System.out.println("HashSet : "+ mySet);
		display(mySet);
		System.out.println("-------------------------------------------------- ");
	
		//addAll()
		Set<String> mySet2  = new HashSet<String>();
		mySet2.add("java");
		mySet2.add("CPP");
		mySet2.add("DBMS");
		mySet2.add(".NET");
		
		mySet.addAll(mySet2);
		System.out.println("After  adding mySet2 in mySet1");
		display(mySet);
		
		//clear()
		mySet2.clear();
		System.out.println("mySet2 after Clear(): - ");
		display(mySet2);
		System.out.println("-------------------------------------------------- ");

		//Contains() method
		boolean isExist =mySet.contains("Mohit");
		System.out.println("Mohit is exist in mySet  : "+isExist );

		//ContainsAll();
		mySet2.add("Dipak ");
		mySet2.add("Gayu");

		boolean isExist1 =mySet.containsAll(mySet2);
		System.out.println("mySet.containsAll(mySet2)  : "+isExist1 );
System.out.println("-------------------------------------------------- ");
		
		//remove()
		mySet.remove("Gayu:");
		//System.out.println("mySet.remove(Gayu) : "+ mySet);
		display(mySet);
System.out.println("-------------------------------------------------- ");

		
		//removeAll()
		mySet.removeAll(mySet2);
		System.out.println("mySet.removeAll(mySet2)");
		display(mySet);

Set<String> mySet3  = new HashSet<String>();
mySet3.add("Dipak");
mySet3.add("Ram");
mySet3.add("Harry");


System.out.println("-------------------------------------------------- ");
//retainAll()     common elements
mySet.retainAll(mySet3);
System.out.println("mySet.retainAll(mySet3)");
display(mySet);
System.out.println("-------------------------------------------------- ");

int size = mySet.size();
System.out.println("Size of the mySet: " + size);

boolean emp = mySet.isEmpty();
System.out.println("Is mySet Empty : " + emp);

System.out.println("-------------------------------------------------- ");
//toArray()
Object arr[] = mySet3.toArray();
for(  Object ob : arr)
{
System.out.println("Ob : "+ ob);
	
}

	}
}


/*
D:\JAVA Workspace\CollectionFramework>java CollectionMethodsWithSetDemo.java
HashSet : Hello
HashSet : Harry
HashSet : Gayu
HashSet : Byyee
HashSet : Dipak
HashSet : Ram
--------------------------------------------------
After  adding mySet2 in mySet1
HashSet : CPP
HashSet : java
HashSet : Hello
HashSet : Harry
HashSet : Gayu
HashSet : Byyee
HashSet : .NET
HashSet : Dipak
HashSet : DBMS
HashSet : Ram
mySet2 after Clear(): -
--------------------------------------------------
Mohit is exist in mySet  : false
mySet.containsAll(mySet2)  : false
--------------------------------------------------
HashSet : CPP
HashSet : java
HashSet : Hello
HashSet : Harry
HashSet : Gayu
HashSet : Byyee
HashSet : .NET
HashSet : Dipak
HashSet : DBMS
HashSet : Ram
--------------------------------------------------
mySet.removeAll(mySet2)
HashSet : CPP
HashSet : java
HashSet : Hello
HashSet : Harry
HashSet : Byyee
HashSet : .NET
HashSet : Dipak
HashSet : DBMS
HashSet : Ram
--------------------------------------------------
mySet.retainAll(mySet3)
HashSet : Harry
HashSet : Dipak
HashSet : Ram
--------------------------------------------------
Size of the mySet: 3
Is mySet Empty : false
--------------------------------------------------
Ob : Harry
Ob : Dipak
Ob : Ram

*/