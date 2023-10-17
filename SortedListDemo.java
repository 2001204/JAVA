
import java.util.*;

class SortedListDemo
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

Collections.sort(myList1);
System.out.println("myList1 After Sorting elemnets are  : - ");
display(myList1);


	}
}