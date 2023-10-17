class GarbageCollectionDemo
{
    public static void main(String [] args)
    {

		Second s1 = new Second("obj1");     //obj1
		Second s2 = new Second("obj2");      //obj2
		s1.myFun();
		s2 = null;       //Nullifying ther reference vaiable
		s1 = new Second(" obj4");      //reassigning the reference variable

		new Second("obj5");             //annonymous object as its reference not store

		System.gc();
		//Runtime.getRuntime();
		System.out.println("Program working successfully");
  }
}

class First
{

}

class Second
{
	String name;
	Second (String name)
	{
		this.name = name;
		}
	void myFun()
	{
		Second s = new Second("obj3");     //local reference variable ex.
		System.out.println("myFun of second");
	}
	public void finalize()
	{
			//pre task bnefore freeing up the object
			System.out.println("Finalize() called for " + this.name);
	}
}