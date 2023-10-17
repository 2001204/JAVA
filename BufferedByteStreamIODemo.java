import java.io.*;

class BufferedByteStreamIODemo
{
 public static void main(String args[]) throws IOException
{
File f1 = new File("myfile.txt");
File f2 = new File("myoutfile.txt");

if (f1.exists() == false)
{
System.out.println("this file does not exist");
return;
}

//reading from file
FileInputStream fis = new FileInputStream(f1);
System.out.println("To read character from file : " + fis.available());
BufferedInputStream bis =new BufferedInputStream(fis);

FileOutputStream fos = new FileOutputStream("myoutfile.txt");
BufferedOutputStream bos = new BufferedOutputStream(fos);

int ch ;
while((ch = fis.read())!= -1)
{
//System.out.print(ch);
System.out.print((char ) ch);      //consol print
bos.write(ch);
}
fis.close();
bos.flush();
fos.close();
System.out.println("IO operation done succesfully");

}


}