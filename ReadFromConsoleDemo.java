import java.io.*;

class ReadFromConsoleDemo
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String inputStr;

		System.out.println("Enter any integer value: ");
		inputStr = br.readLine();
		int ival = Integer.parseInt(inputStr);

		System.out.println("Enter any double value:");
		inputStr = br.readLine();
		double dval = Double.parseDouble(inputStr);

		System.out.println("Enter any String: ");
		inputStr = br.readLine();
		String line = inputStr;

		System.out.println("Enter any boolean value:");
		inputStr = br.readLine();
		boolean bval = Boolean.parseBoolean(inputStr);

		System.out.println("\nEntered values are as follows: ");
		System.out.println(ival);
		System.out.println(dval);
		System.out.println(line);
		System.out.println(bval);

		is.close();
		br.close();


	}
}
