/*

*/

import java.util.*;

class CarRentalProject{

        public static void main (String[]args){
                Scanner sc=new Scanner(System.in);
               Car cars[]= new Car[3];
                for(int i=0;i<cars.length;i++){
                        String s1=sc.nextLine();
                        String s2=sc.nextLine();
                        
                        System.out.println("ENter price:");
                        int s3=  Integer.parseInt(sc.nextLine());
                        int s4=  Integer.parseInt(sc.nextLine());
                     cars[i]=new Car(s1,s2,s3,s4);
                
                }
                for(int i=0;i<cars.length;i++){
                    cars[i].displayRecord();
                }
                
                System.out.println("Enter car No:   ");
                int c=sc.nextInt();
                switch(c){
                    case 1:{ 
                        System.out.println("Enter No. of days :   ");
                        int a=sc.nextInt();
                        cars[0].rentalDays(a);
                        cars[0].invoice();
                        break;
                        
                    }
                    case 2:{ 
                        System.out.println("Enter No. of days :   ");
                        int a=sc.nextInt();
                        cars[1].rentalDays(a);
                        cars[1].invoice();
                        break;
                        
                    }case 3:{ 
                        System.out.println("Enter No. of days :   ");
                        int a=sc.nextInt();
                        cars[2].rentalDays(a);
                        cars[2].invoice();
                        break;
                        
                    }
                    
                }
        }
}

class Car{
       String model;
       String brandName;
       int rentalRate;
       String status;
        static int TotalPrice;
        int rentdays;
       Car(){
            this.brandName=null;
            this.model=null;
            this.rentalRate=0;
            this.status=null;

       }
       Car(String model,String brandName){
       this.model=model;
       this.brandName=brandName;
       }
      Car(String model,String brandName,int rentalRate,int status){
         this(model,brandName);
         this.rentalRate=rentalRate;
         if(status==1){
         this.status="Available";
         }else{
             this.status="Booked";
         }
      }
      void displayRecord(){

         System.out.println("Car Brand  : "+brandName+ "  Model: "+model+"   status : "+status + "  Rate :  "+rentalRate);
      }
      void rentalDays(int a){
          this.rentdays=a;
          this.TotalPrice=rentalRate*a;
      }
      void invoice(){
          System.out.println("Thank you for booking car from us ");
           System.out.println("Happy Journey ");
            System.out.println("Car  : "+brandName);
             System.out.println("Model  : "+model);
              System.out.println("Booked For   : "+rentdays +" No. of Days") ;
               System.out.println("Total Worth  : "+TotalPrice);
      }
     
}

