import java.io.*;

class ByteStreamIODemo
{
 public static void main(String args[]) throws IOException
{
File f1= new File("myfile.txt");
File f2= new File("myoutfile.txt");

if (f1.exists() == false)
{
System.out.println("this file does not exist");
return;
}

//reading from file
FileInputStream fis = new FileInputStream(f1);

FileOutputStream fos = new FileOutputStream(f2);
//FileOutputStream fos = new FileOutputStream(f2, true);


int ch ;
while((ch = fis.read())!= -1)
{
//System.out.print(ch);
System.out.print((char ) ch);    //this is for consol print
fos.write(ch);                   //this writes f1 content into f2 file
}
fis.close();
fos.close();
System.out.println("IO operation done succesfully");

}


}