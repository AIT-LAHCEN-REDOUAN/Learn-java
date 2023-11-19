package packages;

public class Booleans {

    static boolean member ;

    public static void main(String Args[]){
        int b = 5 ;

        if (b>5){
            member= true ;
        }
        else {
            member=false ;
        }

        System.out.println(member);
        System.out.println(!member);

        //change String Value to Boolean

        String Bol = "true" ;
        System.out.println(Boolean.parseBoolean(Bol));
    }
}
