import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;

class NioDemo
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis = new FileInputStream("myfile.txt");
		FileChannel fcin = fis.getChannel();
		ByteBuffer bb = ByteBuffer.allocate((int)fcin.size());

		fcin.read(bb);		//from channel to buffer

		//Read from the buffer
		bb.rewind();

		for(int i = 0; i < (int)fcin.size(); i++)
		{
			System.out.print((char)bb.get(i));
		}

		//Writing to the file from the buffer
		bb.rewind();
		FileOutputStream fos = new FileOutputStream("myoutfile.txt");
		FileChannel fcout = fos.getChannel();
		fcout.write(bb);

		fcin.close();
		fis.close();
		fcout.close();
		fos.close();

		System.out.println("I/O operation done successfully");

	}
}
