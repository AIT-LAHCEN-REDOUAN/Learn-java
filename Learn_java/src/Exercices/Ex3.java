package Exercices;

import java.util.*;

public class Ex3 {
    public static void main(String[] Args){

        //Ex1
        System.out.println("-2ca-2cb");
        System.out.println("2x/yx");
        System.out.println("3n%p+nx%p");
        System.out.println("a*/b+c");
        System.out.println("x/y%-z");
        System.out.println("-x/y%z");

        //Ex2

        byte b1 = 10 , b2 = 30 ; //int
        short p = 200 ; //int
        int n = 500; //int
        long q = 100 ; //long
        float x = 2.5F ; //float
        double  y = 5.25; //float
        // float
        //double
        //float

        //Ex3

        char c = 60 , ce='e' ,cg = 'g';
        byte b = 10 ;



        List<Integer> tableau = new ArrayList<Integer>(3);

        tableau.add(20);
        tableau.add(15);
        tableau.add(23);
        int notes  ;

        /*for (int i = 0 ; i<=tableau.size() ; i++){
            notes = tableau.get(i);
            if (tableau.get(i) > tableau.get(i+1) && tableau.get(i) > tableau.get(i+2)){

            }
        }*/
        System.out.println();

        int max = Collections.max(tableau);
        int min = Collections.min(tableau);
        
        System.out.println(max);
        System.out.println(min);






    }
}
