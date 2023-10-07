class StaticDataProg{
	public static void main(String args[]){
		System.out.println( " Static c = " + Demo.c );
		Demo.c+=1;      //  Demo.c=Demo.c + 1;

		System.out.println( " Static c = " + Demo.c );

		Demo d1 = new Demo( 14, 5 );
		System.out.println( " Static c = " + d1.c );
	        d1.increment();
		d1.print();
		Demo d2 = new Demo( 6 , 8 );
		d2.increment();
		d2.print();

		Demo d3 = new Demo( 10 , 8 );
		d3.increment();
		d3.print();

	}
}

class Demo{
		int a ;  			//non static 
		int b;				// non static
		static int c; 		//static default value is 0
 		
		Demo(){
			c++;
		}

		Demo(int a, int b){
			this.a = a ;
			this.b = b ;
		}
		void increment(){
			c++ ;
		}

		void print(){
		System.out.println( );

	        System.out.print( a+ " " );	
		System.out.print( b + " ");
		System.out.print( c+ " " );
		}
}
	

/*
D:\JAVA Workspace\Classobject>java StaticDataProg.java
 Static c = 0
 Static c = 1
 Static c = 1

14 5 2
6 8 3
10 8 4

*/