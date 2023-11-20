package OOP_Concept;

import java.util.Scanner;

public class FirstClass {

    private String FirstName ;
    private String LastName;

         void set(String F ,String L){
         this.FirstName = F ;
         this.LastName = L ;
         };
          void get(){
              System.out.println("the First Nama is :"+this.FirstName+" and The Last Name is : "+this.LastName);
         };
     public static void main(String Args[]){
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the Firt Name : ");
         String FirstName = input.next();

         System.out.println("Enter the Last Name : ");
         String LastName = input.next();

          FirstClass FirstClass1 = new FirstClass();
          FirstClass1.set(FirstName,LastName);
          FirstClass1.get();
     }
}
