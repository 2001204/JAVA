import java.util.*;
class ListSpecificMethods
{

	static void display(List <String>myList1)
	{
		for(String s: myList1)
		System.out.println("LinkList : "+ s );
	}
	public static void main (String args[])
	{
		List<String> myList1  = new LinkedList<String>();

		//add() method
		myList1.add("Hello");
		myList1.add("Dipak");
		myList1.add("Gayu");
		myList1.add("Ram");
		myList1.add("Harry");
		myList1.add("Byyee");
		myList1.add("Byyee");

		display(myList1);

		myList1.add(2,"Mohit");
		System.out.println("myList1 afetr adding mohit at index 2:" );
		display(myList1);
		System.out.println("---------------------------------------- ");
		//addAll()
		List<String> myList2  = new LinkedList<String>();
		myList2.add("krishna");
		myList2.add("Rushi");
		myList2.add("Shiv");

		myList1.addAll(3, myList2);
System.out.println("myList1 afetr adding all elements of myList2 at index 3:" );
display(myList1);
System.out.println("---------------------------------------- ");
//get()
String s = myList1.get(2);
System.out.println("myList1 at index 2 : " + s);
//display(myList1);
System.out.println("---------------------------------------- ");

//indexOf
int idx = myList1.indexOf("Gayu");
System.out.println("Index of Gayu in myList :  " + idx);

int idx1 = myList1.indexOf("Byyee");
System.out.println("Index of Byyee in myList :  " + idx1);

System.out.println("---------------------------------------- ");

//remove()
myList1.remove(2);
System.out.println("myList1.remove(2) : ");
display(myList1);
System.out.println("---------------------------------------- ");

//set()
myList1.set(4, "Ram");
System.out.println("myList1.set(4, Ram): ");
display(myList1);
System.out.println("---------------------------------------- ");

//subList()
List <String> myList3 = myList1.subList(5, 9);
System.out.println("myList3 after getting substring from myList1.subList(5, 9) ");
display(myList3);
System.out.println("---------------------------------------- ");

//LastIndexOf()
idx = myList1.lastIndexOf("Ram");
System.out.println("myList1.lastIndexOf(Ram) :  "+ idx);
idx = myList1.lastIndexOf("Dips");      //return -1 beacause Dips is not in list
System.out.println("myList1.lastIndexOf(Dips) : "+ idx);

System.out.println("---------------------------------------- ");

	}
}

/*
D:\JAVA Workspace\CollectionFramework>java ListSpecificMethods.java
LinkList : Hello
LinkList : Dipak
LinkList : Gayu
LinkList : Ram
LinkList : Harry
LinkList : Byyee
LinkList : Byyee
myList1 afetr adding mohit at index 2:
LinkList : Hello
LinkList : Dipak
LinkList : Mohit
LinkList : Gayu
LinkList : Ram
LinkList : Harry
LinkList : Byyee
LinkList : Byyee
----------------------------------------
myList1 afetr adding all elements of myList2 at index 3:
LinkList : Hello
LinkList : Dipak
LinkList : Mohit
LinkList : krishna
LinkList : Rushi
LinkList : Shiv
LinkList : Gayu
LinkList : Ram
LinkList : Harry
LinkList : Byyee
LinkList : Byyee
----------------------------------------
myList1 at index 2 : Mohit
----------------------------------------
Index of Gayu in myList :  6
Index of Byyee in myList :  9
----------------------------------------
myList1.remove(2) :
LinkList : Hello
LinkList : Dipak
LinkList : krishna
LinkList : Rushi
LinkList : Shiv
LinkList : Gayu
LinkList : Ram
LinkList : Harry
LinkList : Byyee
LinkList : Byyee
----------------------------------------
myList1.set(4, Ram):
LinkList : Hello
LinkList : Dipak
LinkList : krishna
LinkList : Rushi
LinkList : Ram
LinkList : Gayu
LinkList : Ram
LinkList : Harry
LinkList : Byyee
LinkList : Byyee
----------------------------------------
myList3 after getting substring from myList1.subList(5, 9)
LinkList : Gayu
LinkList : Ram
LinkList : Harry
LinkList : Byyee
----------------------------------------
myList1.lastIndexOf(Ram) :  6
myList1.lastIndexOf(Dips) : -1
----------------------------------------
*/