class Vehicle{ 

	int no;
	int mileage;
	String name;
	String model;
	float price;

	Vehicle() {   // zero parameter contr
		no = 123;
		mileage = 20 ;
		name = "fortuner";
		model = "XYZ";
		price = 40.0f;
	}

	

	Vehicle(int a, int b, String c , String d , float e) {   // parameter contr
		no = a;
		mileage = b;
		name = c;
		model = d;
		price = e;
	}

	
	
	void driving(){

	}

	int travel(){	
	int petrolPrice = 103;
	int km = 100 ; 
	int result;
	result = (km/mileage) * petrolPrice;	
	return  result ;	
	
	}

	int travel(int PP, int km){	
	
	int result;
	result = (km/mileage) * PP;	
	return  result ;	
	
	}

	float travel(float PP, int km){	
	
	float result;
	result = (km/mileage) * PP;	
	return  result ;	
	
	}

 	void service(){
	System.out.println("asfjsdfhsjkfdhsjkfdhjsakfdhasjkfddgjka");
	}
	
}
	
class VehicleDemo1{	
	
	public static void main(String args[]){
	
	Vehicle v = new Vehicle();
	Vehicle v1 = new Vehicle(321,15,"swift","abc",50.5f);
	Vehicle v2 = new Vehicle();

	System.out.println(v.no);
	System.out.println(v1.no);
	System.out.println(v2.no);

	
	//System.out.println(v2.travel());
	System.out.println(v1.travel());
	System.out.println(v.travel());

	
	System.out.println(v.travel(100,200));
	System.out.println(v.travel(100.0f,200));

	System.out.println("Cost of the travel is " + v1.travel(100,200));

	}
}