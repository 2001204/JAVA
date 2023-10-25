class Vehicle{ 

	int no;
	int mileage;
	String name;
	String model;
	float price;
char a;

	Vehicle(){}

	Vehicle(int no, int mileage, String name , String model , float price) {   // parameter contr
		this.no = no;
		this.mileage = mileage;
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	Vehicle(int no){
	this.no = no;

	}
	
	

}
	
class VehicleDemo2{	
	
	public static void main(String args[]){
	
	Vehicle v = new Vehicle(654,15,"abc","abc",50.5f);
	
	Vehicle v1 = new Vehicle();

	Vehicle v2 = new Vehicle(1000);
	
	System.out.println(v.no);
	
	System.out.println(v2.name);
	System.out.println(v2.no);
	System.out.print(v2.a);
	System.out.println(v2.price);
	

	}
}