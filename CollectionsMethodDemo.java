
import java.util.*;

class CollectionsMethodDemo
{

        static void display(Collection <?> c)
        {
                for(Object ob : c)
                {
                        System.out.println(ob);
                }
        }
	public static void main(String args[])
    	   {
                List<Integer> myList1 = new LinkedList<Integer>();   

		myList1.add(50);
		myList1.add(40);
		myList1.add(10);
		myList1.add(25);
		myList1.add(15);
		myList1.add(20);

		System.out.println("myList1 elemnets are  : - ");
		display(myList1);
System.out.println("---------------------------------------------------");
//shuffle()
System.out.println("myList1 After Shuffle : - ");
Collections.shuffle(myList1); 
display(myList1);

System.out.println("---------------------------------------------------");
//sort()
Collections.sort(myList1);
System.out.println("myList1 After Sorting elemnets are  : - ");
display(myList1);
System.out.println("---------------------------------------------------");
//max()
Collections.max(myList1);
System.out.println("Maximum element in myList1 : " + Collections.max(myList1));
System.out.println("---------------------------------------------------");
//min()
Collections.min(myList1);
System.out.println("Maximum element in myList1 : " + Collections.min(myList1));
System.out.println("---------------------------------------------------");

	}
}