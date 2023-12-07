package packages;

import java.util.Scanner;

public class Ex1Array {

     /*public void position(int position){

     }

    public static void main(String[] args){
        int[] arr = new int[5];
        for (int i = 0 ; i<arr.length ; i++){
            arr[i] =  i ;
            System.out.println(arr[i]);

        }
      for (int i = 0 ; i<arr.length ; i++){
            arr[i+1]=arr[i];
          System.out.println(arr[i]);
        }

    }*/

    public static void main(String[] args){
        args = new String[3];
        args[0] = "heelo";
        if (args.length !=0) {

            // Set the value of args[0]
            System.out.println(args[0]);
        } else {
            System.out.println("Aucun mot");
        }
    }


}
