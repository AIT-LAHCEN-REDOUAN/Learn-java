package packages;

import java.lang.Object;
import java.util.*;
import java.lang.*;

public class ArrayListExample {
    public static void main(String[] Args){
        int n = 5 ;
        ArrayList<Integer> arr1 = new ArrayList<Integer>();

        for (int i = 0 ; i<=n; i++){

            arr1.add(i);
        }

        System.out.println(arr1);

        ArrayList arr2 = new ArrayList();

        arr2.add("werwr");
        arr2.add(23);


        arr2.set(1,"MY NAME IS MORGOT THE LAST OF ALL KINGS ");

        arr2.remove(0);

        System.out.println(arr2.size());

        System.out.println(arr2);

        //Looping In the Array List

        for (Object ele : arr2){
            System.out.println(ele);
        }

        //Sorting Array Element

        ArrayList arr3 = new ArrayList();
        arr3.add(3);
        arr3.add(4);
        arr3.add(6);
        arr3.add(1);
        arr3.add(2);
        arr3.add(5);

        System.out.println("Array Before Sort"+ arr3);
        Collections.sort(arr3);
        System.out.println(arr3.indexOf(4)) ;
        System.out.println("Array After Sort"+arr3);
    }
}
