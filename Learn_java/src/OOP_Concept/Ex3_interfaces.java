package OOP_Concept;


interface API {
    default void show(){
        System.out.println("DEFAULT API");
    }
}

interface Interface1 extends API {

}

interface Interface2 extends API {

}
public class Ex3_interfaces implements Interface1 , Interface2 {

    public static void main(String[] Args){
        Ex3_interfaces E = new Ex3_interfaces();
        E.show();
    }
}
