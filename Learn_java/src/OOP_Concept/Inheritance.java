package OOP_Concept;

public class Inheritance {
    public int gear ;
    public int speed;

    public  Inheritance(int gear , int speed){
       this.gear = gear ;
       this.speed = speed ;
    }

    public void applyBrake(int decrement){
       this.speed-=decrement ;
    }
     public void speedUp(int increment){
        this.speed+=increment;
     }
     public String ToString(){
        return ("No of grears are"+this.gear + "\n"+"speed of biycycle IS : "+this.speed);
     }
}

class DerivedClass extends Inheritance {
    public int seatHeight ;
    public DerivedClass(int gear , int speed , int startHeight){
        super(gear,speed);
        this.seatHeight = startHeight ;
    }
    public void setHeight(int NewValue){
       this.seatHeight = NewValue ;
    }

    @Override public String ToString(){
        return (super.ToString() + "\nseat Height is "+this.seatHeight);
    }
}

