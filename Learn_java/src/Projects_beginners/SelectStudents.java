package Projects_beginners;
import java.util.* ;
public class SelectStudents {
    public static void main(String[] Args){
        System.out.println("Enter Number of Students : ");
        Scanner scan = new Scanner(System.in);
        int numStudents = scan.nextInt() ;

        String[] Student = new String[numStudents] ;
        int[] age = new int[numStudents];
        Scanner scanName = new Scanner(System.in);
        Scanner scanAge = new Scanner(System.in);
        for (int i = 0 ; i<numStudents ; i++){
            System.out.println("Enter name :");
            Student[i] = scanName.nextLine();
            age[i] = scanAge.nextInt();
        }

        for (int i = 0 ; i<numStudents;i++){
            if (age[i]>=15){
                System.out.println(Student[i]+"can receive a vaccine .");
                System.out.println("The Student is now "+age[i]);
            }
        }
        scan.close();
        scanName.close();
        scanAge.close();
    }
}
