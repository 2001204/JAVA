package collection;

import java.util.Comparator;

public class Sort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getDept().compareTo(o2.getDept())>0){
			return 1;
		}else if(o1.getDept().compareTo(o2.getDept()) == 0) {
			return o1.getEmpName().compareTo(o2.getEmpName());
		}else
			return -1;
	}

}
