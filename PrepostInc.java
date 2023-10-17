import java.io.*;
  
class PrepostInc {
    public static void main(String[] args)
    {
        int x = 5, y, z;

	//y= ++x + x++ + x;
	// y=6 + 6 + 7    y=19
	
	y= ++x + x++ + x++;
	//y = 6 + 6+ 7
        System.out.println(y);
    }
}