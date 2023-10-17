import java.util.*;
class CollectionMethods
{

	static void display(List <String>myList)
	{
		for(String s: myList)
		System.out.println("ArrayList : "+ s );
	}
	public static void main (String args[])
	{
		List<String> myList  = new ArrayList<String>();

		//add() method
		myList.add("Hello");
		myList.add("Dipak");
		myList.add("Gayu");
		myList.add("Ram");
		myList.add("Harry");
		myList.add("Byyee");

		//System.out.println("ArrayList : "+ myList);
		display(myList);
		System.out.println("-------------------------------------------------- ");

		List<String> myList2  = new ArrayList<String>();
		myList2.add("java");
		myList2.add("CPP");
		myList2.add("DBMS");
		myList2.add(".NET");

		//addAll()
		myList.addAll(myList2);
		System.out.println("After  adding myList2 in myList1");
		display(myList);

		//clear()
		myList2.clear();
		System.out.println("myList2 after Clear(): - ");
		display(myList2);
		System.out.println("-------------------------------------------------- ");

		//Contains() method
		boolean isExist =myList.contains("Mohit");
		System.out.println("Mohit is exist in mylist  : "+isExist );

		myList2.add("Dipak ");
		myList2.add("Gayu");
		display(myList2);
		//ContainsAll();
		boolean isExist1 =myList.containsAll(myList2);
		System.out.println("myList.containsAll(myList2)  : "+isExist1 );
System.out.println("-------------------------------------------------- ");

		//remove()
		myList.remove("Gayu");
		//System.out.println("myList.remove(Gayu) : "+ myList);
		display(myList);
System.out.println("-------------------------------------------------- ");


		//removeAll()
		myList.removeAll(myList2);
		System.out.println("myList.removeAll(myList2)");
		display(myList);

List<String> myList3  = new ArrayList<String>();
myList3.add("Dipak");
myList3.add("Ram");
myList3.add("Harry");


System.out.println("-------------------------------------------------- ");
//retainAll()     common elements
myList.retainAll(myList3);
System.out.println("myList.retainAll(myList3)");
display(myList);
System.out.println("-------------------------------------------------- ");

//size();
int size = myList.size();
System.out.println("Size of the myList: " + size);

boolean emp = myList.isEmpty();
System.out.println("Is myList Empty : " + emp);

System.out.println("-------------------------------------------------- ");
//toArray()
Object arr[] = myList3.toArray();
for(  Object ob : arr)
{
System.out.println("Ob : "+ ob);

}

	}
}



/*
D:\JAVA Workspace\CollectionFramework>java CollectionMethods.java
ArrayList : Hello
ArrayList : Dipak
ArrayList : Gayu
ArrayList : Ram
ArrayList : Harry
ArrayList : Byyee
--------------------------------------------------
After  adding myList2 in myList1
ArrayList : Hello
ArrayList : Dipak
ArrayList : Gayu
ArrayList : Ram
ArrayList : Harry
ArrayList : Byyee
ArrayList : java
ArrayList : CPP
ArrayList : DBMS
ArrayList : .NET
myList2 after Clear(): -
--------------------------------------------------
Mohit is exist in mylist  : false
myList.containsAll(myList2)  : true
--------------------------------------------------
ArrayList : Hello
ArrayList : Dipak
ArrayList : Gayu
ArrayList : Ram
ArrayList : Harry
ArrayList : Byyee
ArrayList : java
ArrayList : CPP
ArrayList : DBMS
ArrayList : .NET
--------------------------------------------------
myList.removeAll(myList2)
ArrayList : Hello
ArrayList : Dipak
ArrayList : Ram
ArrayList : Harry
ArrayList : Byyee
ArrayList : java
ArrayList : CPP
ArrayList : DBMS
ArrayList : .NET
--------------------------------------------------
myList.retainAll(myList3)
ArrayList : Dipak
ArrayList : Ram
ArrayList : Harry
--------------------------------------------------
Size of the myList: 3
Is myList Empty : false
--------------------------------------------------
Ob : Dipak
Ob : Ram
Ob : Harry


*/


