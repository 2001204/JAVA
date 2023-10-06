/*An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers 
appear before all positive numbers.

Examples : 

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
*/
/*
class array{
	public static void main( String args[])
{ 
		int arr[ ] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		for( int i =  0 ; i<= arr.length ;  i++)
		{
			if( arr[ i ] < arr[ i+1])
			{
				System.out.println(arr[ i ]);
			}
			else
			      {
					System.out.println(arr[ i+1]);		
				}
		
		} 
	}
		
}
*/

/*
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args){
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" , ");
        }
    }
}
*/


import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args){
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" , ");
        }
    }
}