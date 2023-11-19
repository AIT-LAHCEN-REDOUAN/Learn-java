package packages;

import java.util.Date;
import java.util.StringTokenizer;

public class Strings {
    public static void main(String Args[]){
        String a = "hello" ;
        System.out.println(a);
        a = a.concat(" base");
        //JAVA STRING ARE IMMUTABLE
        //in this example java will create a new Object and ASSIGN base to hello to be "hello base"
        System.out.println(a);
        byte[]  b_arr = {71,124,14,54};
        String s_byte = new String(b_arr);
        System.out.println(s_byte);

        //Char
        String text[] = {"G","E","E","K","S"};
        System.out.println(text);

        //length
        String char1  = "tarnished" ;
        System.out.println(char1.length());
        int aa = 500 ;
        float bb = 25.25F ;
        int result = aa+ (int) bb ;
        System.out.println(result);

        //Date
        Date date  ;
        date = new Date();
        System.out.println(date);

        //String Buffer
        StringBuffer sb = new StringBuffer();
        //append
        sb.append("hello") ;
        sb.append("  ");
        sb.append("World") ;
        System.out.println(sb.toString());

        //insert
        StringBuffer sb1 = new StringBuffer("Hello World") ;
        sb1.insert(0,"Java") ;
        System.out.println(sb1);

        //replace
        StringBuffer sb2 = new StringBuffer("foul tarnished") ;
        sb2.replace(0,3,"java");
        System.out.println(sb2);

        //delete
        StringBuffer sb3 = new StringBuffer("Welcome");
        sb3.delete(1,3);
        System.out.println(sb3);

        //reverse
        StringBuffer sb4 = new StringBuffer("TARNISHED");
        sb4.reverse();
        System.out.println(sb4);

        //capacity

        StringBuffer sb5 = new StringBuffer("BE ASSURED THE ELDEN RING AND BECOME ELDEN LORD");
        System.out.println(sb5.capacity());

        //String Buffer Constructor

        StringBuffer sb6 = new StringBuffer(20);
         sb6.append("iwehrgioerhoweihrgeowiriowerghklwehrgnwiero");
        System.out.println(sb6);

        //SubString

        StringBuffer sb7 = new StringBuffer("QWERTY");
        String sb8 =  sb7.substring(1,3);
        System.out.println(sb8);


        StringTokenizer st1 = new StringTokenizer("Hello Geeks How are you");
         String st10 = st1.nextToken();

        System.out.println(st10);
        System.out.println(st1.nextElement());

        StringBuffer st11 = new StringBuffer() ;
        st11.append(st1.nextElement());
        System.out.println(st11);





    }
}


