package Challenges;

import java.util.Scanner;

public class Challenge3 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if(N>=3){
            System.out.println("Weird");
        } else if (N<=100) {
           System.out.println("Not Weird");
        }
        }
    }

