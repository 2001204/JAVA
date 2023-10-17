import java.util.Scanner;
class ScannerDemo{
	public static void main(String args[])
	{

		Scanner sc  = new Scanner (System.in);
		String str;
		
		System.out.println("Enter any String: ");
		str = sc.next();
		sc.nextLine();

		String line;
		System.out.println("Enter any Line: ");
		line = sc.nextLine();

		int ival;
		System.out.println("Entered inter=ger =value");
		ival = sc.nextInt();

		double dval; 
		System.out.println("Entered Double value: ");
		dval = sc.nextDouble();

		Boolean bolval; 
		System.out.println("Entered boolean value: ");
		bolval = sc.nextBoolean();

		System.out.println("Entered String is: "  + str);
		System.out.println("Entered Line is: "  + line);
		System.out.println("Entered Line is: "  + ival);
System.out.println("Entered Line is: "  + dval);
System.out.println("Entered Line is: "  + bolval);

	}

}
/*


D:\JAVA Workspace>java ScannerClass.java
Enter any String:
hello'
Enter any Line:
how are you
Entered inter=ger =value
121212
Entered Double value:
34.34
Entered boolean value:
true
Entered String is: hello'
Entered Line is: how are you
Entered Line is: 121212
Entered Line is: 34.34
Entered Line is: true
*/