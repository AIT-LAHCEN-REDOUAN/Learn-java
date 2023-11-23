package Exercices;

public class Ex9 {
    public  String Point;
    public int abscisse ;
    public static int Origine ;


    public Ex9(String Point , int abscisse){
        this.Point = Point ;
        this.abscisse = abscisse ;
    }

    public int setOrigine(){
       return  Origine ;
    }
    public int getOrigine(){
        return Origine ;
    }

    public String Afficher(){
        return "Point "+this.Point+" - abcisse :  "+this.abscisse+" relative a une Origine : "+this.getOrigine();
    }

    public static void main(String[] Args){
        Ex9 point = new Ex9("a",5); 
        System.out.println(point.Afficher());
    }
}
