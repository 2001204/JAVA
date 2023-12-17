package collection;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> list = new LinkedList<Employee>();
		Employee e1 = new Employee(1,"Himanshu","Technical","himanshu@gmail.com");
		System.out.println(e1);
		list.add(e1);
		Employee e2 = new Employee(5,"Gopal","IT","gopal@gmail.com");
		Employee e3 = new Employee(2,"Rohit","Admin","rohit@gmail.com");
		Employee e4 = new Employee(3,"Sagar","Technical","sagar@gmail.com");
		Employee e5 = new Employee(4,"Kalyani","IT","kalyani@gmail.com");
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		System.out.println(list.contains(new Employee(4,"Kalyani","IT","kalyani@gmail.com")));
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,new SortByEmpName());
		System.out.println(list);
		Collections.sort(list,new SortByDept());
		System.out.println(list);
		Collections.sort(list,new SortByEmail());
		System.out.println(list);
		Collections.sort(list,new Sort());
		System.out.println(list);
	}

}
