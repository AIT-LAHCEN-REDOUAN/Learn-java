package packages;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String Args[]){

        //asList : Returns a fixed-size list backed by the specified Arrays
        int IntArr[] ={10,20,25,35,25};
        System.out.println("Integer Array As List : "+ Arrays.asList(IntArr));

        //compare : Compares two arrays past as Parameters lexicographically

        int IntArr2[] = {10,20,25,35,25};

        System.out.println(Arrays.compare(IntArr,IntArr2));

        //binarySearch
        System.out.println("25 found In :  "+Arrays.binarySearch(IntArr2,25));

    }
}
