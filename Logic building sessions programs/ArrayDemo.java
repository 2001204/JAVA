class ArrayDemo{	
	
	public static void main(String args[]){

	int a = 10;
	int b = 20;
	int c = 30;
	int d = 40;
	int e = 50;
	int f = 60;
	int e1 = 70;

	int arr[] = {10};
	int arr1[] = {10,20};

	int[] arr2 = {10,20,30};
	//arr2 = {10,20,30};  error

	int []arr3 = {10,20,100};

	// []int arr4 = {10,20,100};  error
	
	System.out.println(arr[0]);
	System.out.println(arr.length);

	System.out.println(arr1[0]+" "+arr1[1]);
	System.out.println(arr1.length);

	System.out.println(arr2[2]);
	System.out.println(arr2.length);

	System.out.println(arr3[2]);
	System.out.println(arr3.length);

	/*
	int arr[] = {10};
	System.out.println(arr[0]);
	arr[1] = 30;
	System.out.println(arr[0]);
	*/

	}

}