package OOP_Concept;

public class PolyMorphism {
    static int Multiply(int a , int b ){
        return a*b;
    }
    static double Multiply(double a , double b){
        return a*b;
    }

    public static void main(String[] Args){
        System.out.println(PolyMorphism.Multiply(5.5,8.5));
    }
}
