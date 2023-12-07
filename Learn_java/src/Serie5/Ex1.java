package Serie5;

import java.awt.*;

public class Ex1 {
    int x ;
    int y ;
    public Ex1(int x , int y){
        this.x=x ;
        this.y=y;
    }
    public void deplace(int dx , int dy){
        this.x+=dx ;
        this.y+=dy;
    }
    public void affiche(){
        System.out.println("Point de coordonnees : "+this.x+" "+this.y);
    }
    public int getX(){
        return x ;

    }
    public int getY(){
        return y;
    }

    public static void main(String[] args){
        Circle cercle = new Circle(12,2,3);
        cercle.affiche();
    }
}

class Circle extends Ex1{
 int r ;


 public Circle(int r, int x, int y){
     super(x,y);
     this.r = r;
 }

 public void deplaceCentre(int x , int y){
     deplace(x,y);

 }

 public void changeRayon(int r){
     this.r = r;
 }

 public Point  getCentre(){
  return new Point( getX(), getY());
 }
 public void affiche(){
     System.out.println("Centre du cercle de Coordonne : "+getX() + " " + getY() + " "+r);
 }

}
