package packages;

import java.util.Scanner;

public class MultiDimetionalArrays {

    public static void main(String[] Args){

        //2D array
        int[][] data = new int[3][3];

        System.out.println("the Number Of rows is : "+data.length);
        System.out.println("the Number Of Colums is :"+data[0].length);

        //3D array

        int[][][] data1 = new int[3][3][3];
        System.out.println(data1.length);
        System.out.println(data1[0][0].length);

        //Ex 2D Array
        int arr[][] = {{3,3,5},{3,6,7},{7,5,6}} ;

        for (int i =0 ; i<3;i++ ){
            for (int j =0;j<3 ; j++){
                System.out.print(arr[i][j] + "  ");



            }
            System.out.println();
        }
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");

        sum(arr);


        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");

         int[] Arr = m1();

         for (int i=0 ; i<Arr.length ; i++){
             System.out.print(Arr[i]+"  ");
         }


         //Every array has an associated Class Object , shared with All other Arrays with same Component type

        int intArray[] = new int[3];
         byte byteArray[] = new byte[3];
         short shortsArray[] = new short[3];
         String strArray[] = new String[3];

        System.out.println(intArray.getClass());
        System.out.println(intArray.getClass().getSuperclass());
        System.out.println(strArray.getClass().getSuperclass());


        //Cloning Arrays

        int IntegerArray[] = new int[]{1,2,3,5,8,7,9};
        int CloningArray[] = IntegerArray.clone();

        for (int i = 0 ; i<CloningArray.length ; i++){
            System.out.println(CloningArray[i]) ;
        }

        System.out.println(IntegerArray==CloningArray);


        //Jagged Array

        System.out.println("-----------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("----------------------------------------");

        /*int r = 5 ;
        int array[][] = new int[r][];
        for(int i =0 ; i<array.length;i++){
            array[i] = new int[i+1];
        }
        int count = 0 ;
        for(int i = 0 ; i<array.length;i++){
            for (int j = 0 ; j<array[i].length;j++){
                array[i][j] = count++;
            }
        }
        System.out.println("Content of 2D Arrays ");
        for (int i = 0 ; i<array.length;i++){
            for(int j = 0 ; j<array[i].length;i++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }*/

        //Example

        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner le Nombre De Row");
        int row = scanner.nextInt();

        System.out.println("Donner le Nombre De Col");
        int col = scanner.nextInt();

        int array2D[][] = new int[row][col];


        int count1 = 0 ;
        for (int i = 0 ; i<row;i++){
            for (int j = 0 ; j<col;j++){
                array2D[i][j] = count1++;
                System.out.println(array2D[i][j]+" ");
            }
            System.out.println();





        }


    }

    public static void sum(int[][] arr ){
        int sum = 0 ;

        for (int i = 0 ; i<arr.length ; i++){
            for (int j = 0 ; j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }

        System.out.println("the Sum Is : "+sum);
        
    }

    public static int[] m1() {
       return new int[] {1,2,3};
    }



}
