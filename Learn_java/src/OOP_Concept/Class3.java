package OOP_Concept;

public class Class3 {
    String name;
    String breed;
    int age;
    String color;

    // Constructor should not have a return type
    public Class3(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Hi, my name is: " + this.getName() + ".\nMy breed, age, and color are: " +
                this.getBreed() + ", " + this.getAge() + ", " + this.getColor() + ".";
    }

    public static void main(String[] args) {
        // Use the constructor to create an instance of the Class3 class
        Class3 tuffy = new Class3("TARNISHED", "PAVILION", 5, "White");

        // Call toString() method implicitly when printing
        System.out.println(tuffy.toString());
    }
}
