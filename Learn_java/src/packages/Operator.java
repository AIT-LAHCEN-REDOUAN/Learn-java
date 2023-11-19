package packages;

import javax.swing.*;

public class Operator {

    public static void main(String Args[]){

        int a = 10 ;
        int b = 11 ;
        int resault =1 ;

        //Arethmetic Operator :

        System.out.println("a+b = "+(a+b));
        System.out.println("a-b =" +(a-b));
        System.out.println("a*b = "+a*b);
        System.out.println("a/b = "+b/a);
        System.out.println("a%b = "+a%b);

        //Unary Operator :

        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);





        System.out.println(!(true));

        //Assignment Operator
        resault +=a;
        System.out.println(resault);


        //Ternary Operator
        int z = 2>3 ? 5 : 6 ;
        System.out.println(z);

        System.out.println("------------------------");
        System.out.println("-------------------------");
        System.out.println("-------------------------");

        iSGreaterThan(2);
    }

    public static void iSGreaterThan(Integer Number){
        switch (Number){
            case  1 :
                JOptionPane.showMessageDialog(null,"the Number Is 1");
                break;
            case 2 :
                 JOptionPane.showMessageDialog(null,"the Number Is 2");
                break;
            case 4 :
                JOptionPane.showMessageDialog(null,"the Number 4 ");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"the nUmber IS 5");
                break;
            case 6 :
                JOptionPane.showMessageDialog(null,"the Number is 6");
                break;
            default:
                JOptionPane.showMessageDialog(null,"the Number Is Greater than other Numbers");
                break;
        }
    }
}
