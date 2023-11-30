package OOP_Concept;

public class PassageParObject {



    public PassageParObject(int a , int b){}
    public static void main(String[] Args){
        int i = 56 ;
        PassageParObject P = new PassageParObject(13,87);
        PassageParObject.change(i);
        System.out.println(i);
        PassageParObject.change1(P);
    }
    public static void change(int i){
        i = 978 ;

    }
    public static void change1(PassageParObject P){
        P = new PassageParObject(4,8);
        PassageParObject PP = P ;

    }
}



