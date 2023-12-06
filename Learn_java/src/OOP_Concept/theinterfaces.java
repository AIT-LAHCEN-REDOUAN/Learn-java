package OOP_Concept;


interface Int1 {
    final int a = 10 ;
    void display();
}




public class theinterfaces implements Int1 {
    public void display(){
        System.out.println("Geeks");
    }

    public static void main(String[] Args){
        theinterfaces t = new theinterfaces();
        t.display();
        System.out.println(a);
    }
}
