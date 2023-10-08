// equals() method
class EqualsMethodObjClass
{
 	public static void main( String args[ ])
   	{
		First f1= new First();
		First f2 = new First();
		boolean res = f1.equals(f2);   // it compares reference variable value not a //object variable value.
System.out.println(res);    //res=false due to shallo caomparison

}
}

class First{

int a;
int b;

}

/*
D:\JAVA Workspace\Classobject>java ObjectClass.java

false
*/