package packages;

import java.util.Scanner;

public class Loops {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.println("Donner Un Nombre : ");
        int Number = input.nextInt() ;

        int i = 0 ;
        //while
        while (i<=Number){
            System.out.println(i);
            i++;
        }

        //for

       loop1: for (int j = 0 ; j<=Number ; j++){
            System.out.println(j);
            if (j>=Number){
                break loop1;
            }
        }

        do{
            System.out.println("Nigga");
        }
        while (i<=Number);


        //infinite loop

        for (;;);





    }
}
