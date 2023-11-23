package Exercices;

public class Ex5 {

    private int nbre = 20 ;
    private int decal ;
    public Ex5(int coeff){
        nbre*=coeff ;
        nbre+=decal ;
    }
    public void affiche(){
        System.out.println("nbre = : "+nbre + " decal : "+decal);
    }

    public static void main(String args[]){
         Ex5 A = new Ex5(5);
         A.affiche();
    }
}

