class Demo
{
	int a;
	
	Demo()
	{
	}
	
	Demo(int a)
	{
		this.a = a;
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
		First f = (First)super.clone();	//It will create and return cloned object, return type Object
		return f;
	}
	
	public String toString()
	{
		return "First[d = " + d + ",b = " + b +"]";
	}
}

class ShallowCloningDemo
{
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Demo d = new Demo(50);
		First f1 = new First(100,d);
		
		System.out.println(f1);
		
		First f2 = (First)f1.clone();
		System.out.println(f2);
		
		f1.d.a = 75;
		f1.b = 125;
		
		System.out.println("After changing the value: ");
		System.out.println(f1);
		System.out.println(f2);
		
	}
}

