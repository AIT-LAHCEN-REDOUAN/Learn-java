package OOP_Concept;

abstract class Shape {
    String Color ;
    abstract double area();
    public abstract String toString();

    public Shape(String Color){
        System.out.println("Shape Constructor Called");
        this.Color = Color ;
    }

    public String getColor(){
        return this.Color;
    }
};

class Circle extends Shape {
    double radius ;
    public Circle(String Color , double radius){
        super(Color);
        System.out.println("Circle Constructor Called");
        this.radius = radius ;
    }
    @Override double area(){
        return Math.PI*Math.pow(radius,2);
    }
    @Override public String toString(){
        return "Circle is : "+super.getColor() + " and area is : "+area();
    }
}

class Rectanngle extends Shape {
    double length ;
    double width ;
    public Rectanngle(String color , double length , double width){
        super(color);
        System.out.println("Rectangle Constructor called");
        this.length = length ;
        this.width = width ;
    }

    @Override double area(){return length*width;}
    @Override public String toString(){
        return "Rectangle Color is : "+super.getColor() + " and Its area is : "+area();
    }
}

public class Abstraction {

    public static void main(String[] Args){
        Shape S1 = new Circle("Red",2.2);
        Shape S2 = new Rectanngle("Yellow",2,4);

        System.out.println(S1.toString());
        System.out.println(S2.toString());
    }
}
