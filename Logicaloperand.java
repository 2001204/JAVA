class Logicaloperand{

public static void main( String args[]){

	int a = 5;
	int b = 10;
	int c= 15;
	

	/* if (! a  > b) {
			//compilation error
	}*/
 	if (! (a  > b)) {
	System.out.println("A is greater than b");
	}

	int res = a > b ? (a > c ? a : c) : (b > c ? b : c);
	System.out.println(res);


	}

}

