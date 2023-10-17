import java.util.*;
class ArrayListDemo
{
	public static void main (String args[])
	{
		List<String> myList  = new ArrayList<String>();
		myList.add("Hello");
		myList.add("Dipak");
		myList.add("Gayu");
		myList.add("Ram");
		myList.add("Harry");
		myList.add("Byyee");
		System.out.println("ArrayList : "+ myList);
		System.out.println("-------------------------------------------------- ");
		//iterating array list using for-each version
		System.out.println("Iteration using for-each loop : - ");
		for (String i : myList )
		{
			System.out.println("ArrayList : "+ i );
			i = i+2;                   //does not affect array length
		}

	System.out.println("-------------------------------------------------- ");
		//Iterating arrylist using Iterator
		System.out.println("Iterating arraylist using Iterator : - ");
		Iterator<String> it = myList.iterator();
		while (it.hasNext())
		{
    		String s = it.next();
    		System.out.println(s);
		}
System.out.println("-------------------------------------------------- ");
		//Iterating arrylist using ListIterator
		System.out.println("Iterating arraylist using ListIterator : - ");
		ListIterator<String> lit = myList.listIterator();
		while (lit.hasNext())
		{
    		String s = lit.next();
    		System.out.println(s);
		}

		System.out.println("Iterating arraylist using Previous : - ");
		ListIterator<String> lit1 = myList.listIterator();
		while (lit1.hasPrevious())
		{
    		String s = lit1.previous();
    		System.out.println(s);
		}
System.out.println("-------------------------------------------------- ");
		//Iterating arrylist using Enumeration
		System.out.println("Iterating arraylist using Enumeration : - ");
		Enumeration <String> em =Collections.enumeration(myList);
		while(em.hasMoreElements())
		{
		String s1 = em.nextElement();
    		System.out.println(s1);
		}

	}
}


/*
		List list1 = myFun();
		List list2 = myanotherFun();
	}
static  List myFun()
{
		ArrayList <String> list1 =new ArrayList<>();
		return list1;
}
static List myanotherFun()
{
		LinkedList <String> list2 =new LinkedList<>();
		return list2;
}
*/

/*
D:\JAVA Workspace\CollectionFramework>java ArrayListDemo.java
ArrayList : [Hello, Dipak, Gayu, Ram, Harry, Byyee]
--------------------------------------------------
Iteration using for-each loop : -
ArrayList : Hello
ArrayList : Dipak
ArrayList : Gayu
ArrayList : Ram
ArrayList : Harry
ArrayList : Byyee
--------------------------------------------------
Iterating arraylist using Iterator : -
Hello
Dipak
Gayu
Ram
Harry
Byyee
--------------------------------------------------
Iterating arraylist using ListIterator : -
Hello
Dipak
Gayu
Ram
Harry
Byyee
--------------------------------------------------
Iterating arraylist using Enumeration : -
Hello
Dipak
Gayu
Ram
Harry
Byyee
*/