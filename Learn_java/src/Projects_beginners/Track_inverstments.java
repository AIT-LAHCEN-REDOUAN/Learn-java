package Projects_beginners;

import java.util.* ;
import java.text.*;
public class Track_inverstments {
    public static void main(String Args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your buying price per Share : ");
        double BuyingPrice = scan.nextDouble();
        double ClosingPrice ;
        DecimalFormat df = new DecimalFormat("0.00");
        int day = 1 ;
        while (true){
            System.out.println("Enter the closing price per day : "+day+" any negative value to leave the Programm : ");
            ClosingPrice = scan.nextDouble();
           if (ClosingPrice < 0.0 ){
               break;
           }
           double earnings  = ClosingPrice-BuyingPrice ;
           if (earnings > 0){
               System.out.println("after day "+day+"  you earned "+df.format(earnings) + " per Share");
           }
           else if (earnings <0){
               System.out.println("after day "+day+" you earned "+(df.format(-earnings)) + " per Share");
           }
           else {
               System.out.println("After day "+day+" you have No earnings ");
           }

           day+=1 ;
        }

        scan.close();
    }
}
