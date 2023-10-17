import java.util .*;
class DifferentMapsDemo{

public static void main(String args[])
{
System.out.println("---------------HashMap---------------------");
Map<String, String> myMap1 = new HashMap<String, String>();
//Map<Integer, String> myMap1  = new TreeMap<Integer,String>();
//Map<Integer, String> myMap1  = new LinkedHashMap<Integer,String>();
myMap1. put ("three", "Javed") ;
myMap1. put ("two", "Rakesh") ;
myMap1.put ("five", "Aman") ;
myMap1.put ("four", "Geeta") ;
myMap1. put ("one", "Sohan") ;
//Iterating the map elements
for(Map. Entry<String, String> entry : myMap1. entrySet ())
{
System.out.println(entry.getKey() + "," + entry.getValue());
}
System.out.println("---------------LinkedHashMap---------------------");
Map<Integer, String> myMap2  = new LinkedHashMap<Integer,String>();
myMap2. put (5, "Javed") ;
myMap2. put (3, "Rakesh") ;
myMap2.put (1, "Aman") ;
myMap2.put (4, "Geeta") ;
myMap2. put (2, "Sohan") ;
//Iterating the map elements
for(Map. Entry<Integer, String> entry : myMap2. entrySet ())
{
System.out.println(entry.getKey() + "," + entry.getValue());
}
System.out.println("---------------TreeMap---------------------");
Map<Integer, String> myMap3  = new TreeMap<Integer,String>();
myMap3. put (1, "Javed") ;
myMap3. put (2, "Rakesh") ;
myMap3.put (5, "Aman") ;
myMap3.put (4, "Geeta") ;
myMap3. put (3, "Sohan") ;
//Iteating the map elements
for(Map. Entry<Integer, String> entry : myMap3. entrySet ())
{
System.out.println(entry.getKey() + "," + entry.getValue());
}

}
}

/*

D:\JAVA Workspace\CollectionFramework>java DifferentMapsDemo.java
---------------HashMap---------------------
four,Geeta
one,Sohan
three,Javed
two,Rakesh
five,Aman
---------------LinkedHashMap---------------------
5,Javed
3,Rakesh
1,Aman
4,Geeta
2,Sohan
---------------TreeMap---------------------
1,Javed
2,Rakesh
3,Sohan
4,Geeta
5,Aman
*/