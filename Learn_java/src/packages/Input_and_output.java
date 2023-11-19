package packages;

import java.util.Scanner;
public class Input_and_output {
  public static void main(String Args[]){
      Scanner input = new Scanner(System.in);

      System.out.println("Enter an Integer : ");

      int Number1=input.nextInt();
      String Text = input.next();

      System.out.println("the Number Is :  "+Number1+"And the Text Is : "+Text);

  }

}
