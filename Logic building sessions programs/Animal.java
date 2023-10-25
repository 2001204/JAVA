class Animal {

	String name;
	String breed;
	int noOfLeg;
	int wt;
	String color;

	Animal(){

	breed="Dog";

		}


	void eat(){

	//int n ="abc";  // local variable , get memory on stack
	System.out.println("In eat()");
	sleep();
	System.out.println("back In eat()");

	}

	void sleep(){
	System.out.println("In sleep()");
	sound();
	System.out.println("back In sleep()");
	}
	void sound(){
	System.out.println("In sound()");
	}

}

class AnimalDemo{

	public static void main(String args[]){

	Animal aObj = new Animal();
	System.out.println("In main()");
	aObj.eat();
	System.out.println("back In main()");

	Animal bObj = new Animal();

	}



}