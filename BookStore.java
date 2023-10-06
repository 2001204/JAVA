/*1. Book Store
--Implement a Book class with attributes title, author and price
. Create constructors for the Book
class - 
---one that takes all the attributes as parameters and another that takes only title, author
as parameters and assigns a default value for price and more if needed.
---Now, create an array of Book objects to store information about books. Use constructor
chaining to initialize the objects,
and then display the details of all the books in the inventory.
---Create a method to change the price of a book and to calculate the price of all the books
present in array (Optional). 
*/

import java.util.*;
class BookStore{

        public static void main (String[]args){
                Scanner sc=new Scanner(System.in);
               Book books[]= new Book[3];
                for(int i=0;i<books.length;i++){
                        String s1=sc.nextLine();
                        String s2=sc.nextLine();
                        
                        System.out.println("ENter price:");
                        int s3=  Integer.parseInt(sc.nextLine());
                     books[i]=new Book(s1,s2,s3);
                
                }
                for(int i=0;i<books.length;i++){
                    books[i].displayRecord();
                    books[i].sumOfBooks();
                    
                }
                System.out.println(Book.TotalPrice);
                }
}

class Book{
       String title;
       String author;
       int price;
        static int TotalPrice;
       Book(){
            this.title=null;
            this.author=null;
            this.price=0;

       }
       Book(String title,String author){
       this.title=title;
       this.author=author;
       }
      Book(String title,String author,int price){
         this(title,author);
         this.price=price;
      }
      void displayRecord(){

         System.out.println("Book Title: "+title+ "  Book Author: "+author+"   Price : "+price);
      }
      void sumOfBooks(){
          this.TotalPrice=TotalPrice+price;
           
      }
}