package packages;

import java.util.Scanner;

public class Exercice1 {

    public static void main(String[] Args ){
        Scanner input = new Scanner(System.in) ;


        System.out.println("donner Un Nombre :");
        int a  = input.nextInt();

        System.out.println(a);

        double result = 1 ;
          for (int i=1;i<=a;i++){
            result += 1.0/i;


        }
        System.out.println(result);

    }


}
