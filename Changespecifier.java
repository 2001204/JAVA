//Changespecifier
/*
private---->  no
protected----> protected, public 
default ---> Default, protected, public 
public--> public
*/
class Changespecifier
{
	
	public static void main( String args[])	{
		Second s = new Second();
		s.myFun();
	}
}

class First
{
	protected void myFun()          
	{
		//code
	}
}
class Second extends First
{
	//private void myFun()    //not okk
 	//void myFun()      not okk
	public void myFun()       //ok
	{  
		//code
	}
}

/*
 error: myFun() in Second cannot override myFun() in First
        void myFun()
             ^
  attempting to assign weaker access privileges; was protected

*/