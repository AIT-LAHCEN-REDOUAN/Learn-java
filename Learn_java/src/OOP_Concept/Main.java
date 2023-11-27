package OOP_Concept;

import java.lang.*;
import java.io.*;
import java.util.*;

interface One {
    public void print_geek();
}
interface Two {
    public void print_for();
}

interface three extends One,Two {
    public void print_geek();
}

class Child implements three {
    @Override public void print_geek(){
        System.out.println("Hello Foul Tarnished");
    }
    public void print_for(){
        System.out.println("For");
    }
}

public class Main{
    public static void main(String Args[]){
        Child C = new Child();
        C.print_for();
        C.print_geek();
    }
}
