class Dataconversion{
	public static void main (String args[])
	{
		int a;
		long b = 25;
		a = ( int )b;
		System.out.println(a);	//implicit widening conversion
		
		float c = (float)25.4 ;        //double to float typecast
 		System.out.println(c);
 
		double d= 34.5;
                c= (float)d;
		System.out.println(c);	//explicit narrowing conversion

		d = (double)c;                //implicit  
		System.out.println(d);

		a= (int)c;                   //explicit narrowing conversion   float-->int
		System.out.println(a);

		a= 258;
		byte p= (byte)a;              //explicit narrowing conversion  int-->byte
		System.out.println(p);    // 00000000 00000000 00000001 00000010=258 ,  00000010 = 2 
		// 2  beacause 00000010  has left most significanrt bit is 0 thats why getting number will be postitive zero.

		a= 130;
		p= (byte) a;             //10000010-->1s complement
		System.out.println(p);       //01111101 -->2s complement== -126
		// -126 beacause 10000010  has left most significanrt bit is 1 thats why getting number is zero.
	}
}