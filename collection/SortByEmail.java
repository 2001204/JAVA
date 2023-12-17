package collection;

import java.util.Comparator;

public class SortByEmail implements Comparator<Employee>{

	public int compare(Employee e1,Employee e2) {
		return e1.getEmail().compareTo(e2.getEmail());   //ascending
	}
}
