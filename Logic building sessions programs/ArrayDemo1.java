import java.util.Scanner;
class ArrayDemo1{	
	
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	/*
	int arr[] = {10.0};
	
	System.out.println(arr[0]);
	*/
	int arr[] = new int[5]; 
	
	/*arr[0]=10;
	arr[1]=20;
	arr[2]=10;
	arr[3]=20;
	arr[4]=10;*/
	//arr[5]=20;


	/*System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);*/
	//System.out.println(arr[5]);

	System.out.println(arr.length);

	System.out.println("Input To an array");
	for(int i=0; i<arr.length;i++){
		arr[i] = sc.nextInt();
	}
	int sum=0;
	System.out.println("array output");
	for(int i=0; i<arr.length;i++){
		System.out.println(arr[i]);
		
		 sum=sum+arr[i];
	
	}
	
	System.out.println("Sum "+ sum);

	
	}

}