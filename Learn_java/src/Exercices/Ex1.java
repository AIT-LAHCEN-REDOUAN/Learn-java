package Exercices;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] Args){
        //Ex1
        System.out.println("Hello");
        System.out.println("AIT-LAHCEN REDOUAN");

        //Ex2
        int a = 50 ;
        int b = 100 ;
        System.out.println("Expected OutPut is :"+(a+b));

        //Ex3

        int a1 = 3 ;
        int b1 = 50 ;
        System.out.println("Solution is : "+(float)(3/50));

        //Ex4

        System.out.println("a : "+(-5+8*6));
        System.out.println("b : "+(55+9)%9);
        System.out.println("c : "+(20+(-3*5)/8));
        System.out.println("d : "+(5+(15/3*2)-(8%3)));

        //Ex5

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int num1 = input.nextInt();
        System.out.println("Enter the Second Number : ");
        int num2 = input.nextInt();

        System.out.println("the Square Of "+num1+" and "+num2+" is : "+(num1*num2));
        System.out.println("the Addition Of "+num1+" and "+num2+" is : "+(num1+num2));
        System.out.println("the SubStract Of "+num1+" and "+num2+" is : "+(num1-num2));
        System.out.println("the Division Of "+num1+" and "+num2+" is : "+(num1/num2));
        System.out.println("the Mod Of "+num1+" and "+num2+" is : "+(num1%num2));

        //Ex7

        for (int i = 0 ; i<=num2;i++){
            System.out.println(num1*i);
        }




    }
}
