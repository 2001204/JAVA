class Demo implements Cloneable
{
	int a;
	
	Demo()
	{
	}
	
	Demo(int a)
	{
		this.a = a;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		Demo d = (Demo)super.clone();
		return d;
	}
	
	public String toString()
	{
		return "Demo[a = " + a + "]";
	}
}


class First implements Cloneable 		//Cloneable marker interface
{
	int b;
	Demo d;
	
	First()
	{
	}
	
	First(int b, Demo d)
	{
		this.b = b;
		this.d = d;
	}
	
	public Object clone() throws CloneNotSupportedException		//Object class method
	{
		First fclone = (First)super.clone();	//It will create and return cloned object, return type Object
		fclone.d = (Demo)d.clone();		//Demo class clone() method will be called here		
			
		return fclone;
	}
	
	public String toString()
	{
		return "First[d = " + d + ",b = " + b +"]";
	}
}

class DeepCloningDemo
{
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Demo d = new Demo(50);
		First f1 = new First(100,d);
		First f2 = (First)f1.clone();	//Creates clone of f1 object and saves its reference in f2
		
		System.out.println("f1: "+f1);
		System.out.println("f2: "+ f2);
		
		f1.d.a = 75;
		f1.b = 125;
		
		System.out.println("After changing the value of f1 object: ");
		System.out.println("f1: "+f1);
		System.out.println("f2: "+ f2);
		
	}
}

