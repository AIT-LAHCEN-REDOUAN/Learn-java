package OOP_Concept;

import java.io.*;

public class Class3 implements Serializable {
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

        //Serialization
try{
    FileOutputStream file = new FileOutputStream("file.bin");
    ObjectOutputStream out = new ObjectOutputStream(file);

    out.writeObject(tuffy);

    out.close();
    file.close();

    System.out.println("Object Has Been Serialized");
}catch (IOException ex){
    System.out.println("IOExeption is caught");
}
//Desetializatio

        try {
            FileInputStream file1 = new FileInputStream("file.bin");
            ObjectInputStream in = new ObjectInputStream(file1);

            Class3 Object1 = (Class3)in.readObject();
            in.close();
            file1.close();

            System.out.println("Object Has Been deserialized");
            System.out.println(Object1.name);
            System.out.println(Object1.breed);
            System.out.println(Object1.age);
            System.out.println(Object1.color);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}
