package packages;

public class ARRAY2 {

        public static void main(String[] args) {
            // First 2D Array with 3 columns
            int[][] arr1 = new int[3][3];

            // Second 2D Array with 2 columns
            int[][] arr2 = {{3, 3}, {3, 6}, {1, 2}};

            // Displaying the first array
            System.out.println("First Array:");
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    System.out.print(arr1[i][j] + "  ");
                }
                System.out.println();
            }

            // Displaying the second array
            System.out.println("\nSecond Array:");
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2[i].length; j++) {
                    System.out.print(arr2[i][j] + "  ");
                }
                System.out.println();
            }
        }


}
