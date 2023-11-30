package OOP_Concept;


interface AnimalLLF {
    abstract void getNoise();
    abstract void getFamily();
}
public class Interfaces implements AnimalLLF {

    //@Override
    public void getNoise() {
        System.out.println("Bizz");
    }

    //@Override
    public void getFamily() {
        System.out.println("Im an insect");
    }
}

class Dog implements AnimalLLF{

    private String breed;
    public Dog(String breed){
        this.breed = breed ;
    }
    //@Override
    public void getNoise() {
        System.out.println("Wolf");
    }

    //@Override
    public void getFamily() {
        System.out.println("I'm a mamaal");
    }

    public void getBreed() {
        System.out.println("I'm a "+breed);
    }

    public static void main(String[] Args){
        Interfaces P = new Interfaces();
        P.getNoise();
        P.getFamily();

        Dog D = new Dog("kjadshn");
        D.getFamily();
        D.getBreed();
        D.getNoise();
    }
}
