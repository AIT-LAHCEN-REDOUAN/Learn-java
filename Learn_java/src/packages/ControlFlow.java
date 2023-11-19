package packages;

import com.sun.source.tree.SwitchTree;

import javax.swing.*;
import java.util.Calendar;
import java.util.Scanner;

public class ControlFlow {
    public static void main(String Args[]){
        if(true == true){
            System.out.println("Hello Little Nigga");
        }
        int note = 30 ;
        if(note >= 10 && note < 20){
            JOptionPane.showMessageDialog(null , "The Is Must be True !!");
        }
        else {
            JOptionPane.showMessageDialog(null,"FOUL TARNISHED IN SEARCH OF THE ELDEN RING EMBOLDENED BY THE FLAME OF AMBITION");
        }



        //Example
         int maroc = 1 , algerie = 2 , spain = 3;

        if(maroc == 1 && algerie ==2 && spain ==3){
            System.out.println("welciome");
        } else if (maroc ==1 && algerie ==2 && spain ==5) {
            System.out.println("Get Out !!");
        }
        else {
            System.out.println("you are Nigga");
        }

        //switch example

        System.out.println("Donner Un Nombre : ");
        Scanner input = new Scanner(System.in);
        int Number = input.nextInt() ;
        System.out.println(Number);

        switch (Number){
            case 20 :
                JOptionPane.showMessageDialog(null , "Value True");
                break;
            case 19 :
                JOptionPane.showMessageDialog(null , "Value False");
                break;
            default:
                  JOptionPane.showMessageDialog(null , "No Number In the record");

        }

    }
}
























