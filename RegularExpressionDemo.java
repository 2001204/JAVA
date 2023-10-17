import java.util.*;
class RegularExpressionDemo
{
	public static void main(String args[])
	{
		//String regex = "(\\+91|0)[0-9]{10}";
		//String regex = "[^0-9][a-zA-Z0-9]+@(gmail.com|cdac.in)";
		//String regex = "\\D[a-zA-Z0-9]+@(gmail.com|cdac.in)";
		String regex = "\\w+\\sjava\\b\\s\\w+";
		String inptStr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string to match with regex : "+regex);
		inptStr = sc.nextLine();
		boolean matched = inptStr.matches(regex);

		if(matched)
			System.out.println("Valid");
		else
			System.out.println("Invalid");


	}
}
