import java.io.*;

class BufferedCharacterStreamIODemo
{
	public static void main(String args[]) throws IOException
	{
		File f1 = new File("myfile.txt");
		File f2 = new File("myoutfile.txt");

		if(f1.exists() == false)
		{
			System.out.println(f1.getName() + " does not exists !!");
			return;
		}

		FileReader fr = new FileReader("myfile.txt");//will read from myfile.txt
		BufferedReader br = new BufferedReader(fr);

		FileWriter fw = new FileWriter("myoutfile.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		//Read one character at a time		
		/*int ch;
		while((ch = br.read()) != -1)
		{
			System.out.print((char)ch);	//console print
			bw.write(ch);
		}*/

		//Read one line at a time
		String line;
		while((line = br.readLine()) != null)
		{
			System.out.println(line);	//console output
			bw.write(line + "\n");
		}

		fr.close();
		bw.flush();
		fw.close();
		System.out.println("I/O operation done sucessfully");
	}
}
