package collection;

import java.util.Comparator;

public class SortByDept implements Comparator<Employee>{

	public int compare(Employee e1,Employee e2) {
		//return e1.getDept().compareTo(e2.getDept());   //ascending
		return e2.getDept().compareTo(e1.getDept());   //descending
	}
}
