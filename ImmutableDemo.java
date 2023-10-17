class ImmutableDemo
{
	public static void main(String args[])
	{

		String s1= "Hello";
		String s2= s1.concat("World");
		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);

		String s3="Hello World";
		System.out.println(s2==s3 ? "2 == s3" : "s1!= s3");    
		
		String s4="Hello";        
		System.out.println(s1==s4 ? "s1 == s4" : "s1!= s4");    

	}

}
/*

D:\JAVA Workspace>java ImmutableDemo.java
s1=Hello
s2=HelloWorld
s1!= s3
s1 == s4
*/