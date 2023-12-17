package collection;

import java.util.HashSet;

public class HashSetUser {

	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<Employee>();
		Employee e1 = new Employee(1,"Himanshu","Technical","himanshu@gmail.com");
		Employee e2 = new Employee(5,"Gopal","IT","gopal@gmail.com");
		Employee e3 = new Employee(2,"Rohit","Admin","rohit@gmail.com");
		Employee e4 = new Employee(3,"Sagar","Technical","sagar@gmail.com");
		Employee e5 = new Employee(4,"Kalyani","IT","kalyani@gmail.com");
		Employee e6 = new Employee(4,"Kalyani","IT","kalyani@gmail.com");
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		hs.add(e6);
		for(Employee e : hs) {
			System.out.println(e);
		}
		
	}
}
