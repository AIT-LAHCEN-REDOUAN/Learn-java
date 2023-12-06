package OOP_Concept;
import java.io.*;
interface Vehicle{
    void changeGear(int a);
    void speedUp(int a );
    void applyBrakes(int a);
}

class bicycle implements Vehicle {
    int speed ;
    int gear ;

    @Override
    public void changeGear(int NewGear){
       this.gear = NewGear ;
    }

    @Override
    public void speedUp(int increment){
     this.speed+=increment ;
    }

    @Override
    public void applyBrakes(int decrement){
       this.speed-=decrement ;
    }


    public void printStates(){
        System.out.println("speed : "+this.speed + " gear : "+ this.gear);
    }
}
public class Example2_interface {

    public static void main(String[] Args){
        bicycle b = new bicycle() ;
        b.changeGear(3);
        b.speedUp(5);
        b.applyBrakes(4);
        b.printStates();

    }

}
