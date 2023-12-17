package collection;

public class Employee implements Comparable<Employee>{
	
	private Integer empId;
	
	private String empName;
	
	private String dept;
	
	private String email;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empId, String empName, String dept, String email) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.email = email;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employee Id:"+empId+" & Employee Name:"+empName+" & department:"+dept+" & email:"+email;
	}

	@Override
	public boolean equals(Object o) {
		Employee e = (Employee)o;
		if(e.empId.equals(this.empId) && e.empName.equals(this.empName) && e.dept.equals(this.dept) && e.email.equals(this.email))
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode()
	{
		return 71*empId;
	}
	
//	@Override
//	public int compareTo(Employee e) {    //ascending
//		//return this.empId.compareTo(e.empId);
//		if(empId>e.empId)
//			return 1;
//		else if(empId.equals(e.empId))
//			return 0;
//		else
//			return -1;
//	}
	
	@Override
	public int compareTo(Employee e) {  //descending
		//return e.empId.compareTo(this.empId);
		if(e.empId>empId)
			return 1;
		else if(e.empId.equals(empId))
			return 0;
		else
			return -1;
	}
}
