import java.util.*;

class MapDemo
{
	static void display(Collection <?> c)
	{
		if (c == null) return;
		for(Object ob : c)
		//System.out.println("MapSet : "+ ob);
		System.out.println( ob );
	}
	public static void main(String args[])
	{
		Map<Integer, String> myMap1  = new HashMap<Integer,String>();
		//Map<Integer, String> myMap1  = new LinkedHashMap<Integer,String>();
		//Map<Integer, String> myMap1  = new TreeMap<Integer,String>();
		//put() -- to put into map
		myMap1.put(1,"Dipak");
		myMap1.put(2,"Gayu");
		myMap1.put(3,"Dips");
		myMap1.put(4,"Ram");
		myMap1.put(5,"Yash");

		//get() -- to retrive from the map
                String s= myMap1.get(4);
                System.out.println("Roll no 4 is "+ s);

		//Iterating using entrySet();
             //entrySet() --- it gives the set of map entry object for the respective map
		 Set<Map.Entry<Integer, String>> mySet1 = myMap1.entrySet();
		 System.out.println("Map Elements are : ");
         for( Map.Entry<Integer, String> entry : mySet1)
		//for( Map.Entry<Integer, String> entry : myMap1.entrySet())
		{
			 //System.out.println(entry);
			int key =entry.getKey();
			String value = entry.getValue();
			System.out.println("RollNO : " +key+"   Name: " +value);
		}

		// display(mySet1);
		mySet1.remove("Ram");
System.out.println("Removing Ram from Set and Iterating Map Element");
for( Map.Entry<Integer, String> entry : myMap1.entrySet())
{
	System.out.println(entry);
}

	}
}

/*
D:\JAVA Workspace\CollectionFramework>java MapDemo.java
Roll no 4 is Ram
Map Elements are :
RollNO : 1   Name: Dipak
RollNO : 2   Name: Gayu
RollNO : 3   Name: Dips
RollNO : 4   Name: Ram
RollNO : 5   Name: Yash
*/
