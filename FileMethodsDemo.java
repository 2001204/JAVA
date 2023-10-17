class FileMethodsDemo
{
public static void main ( String args[])
{
	File f  = new File("Serialization");
	if(!f.exist())
{
return;
}

if(f.idDirectory())
{
	System.out.println(f.getName()  + "is a directory");
	String filenames[] = f.list();
	for (String fname : filenames)
	{
		System.out.println(fname);
	}

}

}

}