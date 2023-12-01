package OOP_Concept;

public class Encapsulation {

    private String name ;
    private int age  ;

    public Encapsulation(String name , int age){
        this.name = name ;
        this.age = age ;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] Args){
        Encapsulation A1 = new Encapsulation("redouan",15);
        System.out.println(A1.getAge());
        A1.setName("ayoub");
        System.out.println(A1.getName());

    }
}
