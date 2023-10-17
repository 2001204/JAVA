import java.io.*;

class CharacterStreamIODemo
{
 public static void main(String args[]) throws IOException
{
File f1= new File("file.txt");
File f2= new File("Outfile.txt");

if (f1.exists() == false)
{
System.out.println("this file does not exist");
return;
}

//reading from file
FileReader fr = new FileReader(f1);
FileWriter fw = new FileWriter(f2);
//FileWriter fw = new FileWriter(f2, true);



int ch ;
while((ch = fr.read())!= -1)
{
//System.out.print(ch);
System.out.print((char ) ch);
fw.write(ch);
}
fr.close();
fw.close();
System.out.println("IO operation done succesfully");

}


}