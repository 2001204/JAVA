import java.util.*;

class ArrayClassMethodDemo
{

        static void display(int array[])
        {
                for(int v : array)
                {
                        System.out.println(v);
                }
        }
	public static void main(String args[])
    	   {
		int arr[] = {2,8,7,5,6,1,3,7,5};
		int arr1[] = {2,8,7,5,6,1,3,7,5};
                System.out.println("Array Element: ");
display(arr);

//toString
System.out.println("String representation of Array Elemnet: ");
String str = Arrays.toString(arr);
System.out.println(str);

//sort
Arrays.sort(arr);
System.out.println("Array After sorting");
display(arr);

//binarySearch()
int idx = Arrays.binarySearch(arr, 5);
System.out.println("Index of 5 in Array After sorting : " + idx);

//equals()  check if two array contain same elements and same order
boolean boolres = Arrays.equals(arr,arr1);
System.out.println("arr equals arr1 is  : " + boolres);

//fill()
int arr2[] = new int[5];
Arrays.fill(arr2,1);
//Arrays.fill(arr2,2,4,1);  from inde x 2 to index 4 fill 1
System.out.println("arr2 elements are  : " );
display(arr2);


	}
}

/*
D:\JAVA Workspace\CollectionFramework>java ArrayClassMethodDemo.java
Array Element:
2
8
7
5
6
1
3
7
5
String representation of Array Elemnet:
[2, 8, 7, 5, 6, 1, 3, 7, 5]
Array After sorting
1
2
3
5
5
6
7
7
8
Index of 5 in Array After sorting : 4
arr equals arr1 is  : false
arr2 elements are  :
1
1
1
1
1
*/