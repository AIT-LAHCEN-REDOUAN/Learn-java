package OOP_Concept;

import javax.swing.*;
import java.util.ArrayList;

abstract class Employe{

    protected int noEmploye ;
    protected String nom ;
    public Employe(int noEmploye , String nom){
        this.noEmploye = noEmploye ;
        this.nom = nom;
    }
    abstract double getSalaire();

    public String ResumePaye(){
        return ("Un Instance de Agent le numero D'employe est : "+this.noEmploye + " le nom d'employe est : "+this.nom);
    }
}

class Agent extends Employe{
    private int NbHeures ;
    private int indice ;

    public Agent(int NbHeures , int indice , int no , String n){
        super(no,n);
        this.NbHeures=NbHeures ;
        this.indice = indice;
    }
     public double getSalaire(){
        if (this.NbHeures >1000){
            JOptionPane.showMessageDialog(null,"the Number Is OVER 1000 !!");
        }
        else {
           return this.NbHeures*this.indice;
        }
        return 0;

    }

}

class Echelon {
    public final int ASSISTANT = 1 ;
    public final int CHEF_DE_CLINIQUE = 2 ;
    public final int CHEF_DE_SERVICE = 3 ;

    public double getSalaire1(int echelon){
        switch (echelon){
            case  ASSISTANT :
                return 3000.0;
            case CHEF_DE_CLINIQUE :
                return 5000.0;
            case CHEF_DE_SERVICE :
                return 8000;
            default:
                return 0.0 ;
        }
    }
}

class Medecin extends Employe{
    private int echelon ;
    Echelon echelonInstance = new Echelon() ;

    public Medecin(int no , String n,int echelon){
        super(no, n);
        this.echelon = echelon ;

    }

    public double getSalaire(){
        return echelonInstance.getSalaire1(echelon);

    }

}

class ListeEmployes {
     static ArrayList<Employe> employes = new ArrayList(30)  ;

    public static String getEmployes() {
        for (Employe employeObj : employes){
             System.out.println(employeObj.nom);
        }
        return "";
    }

    public void setEmployes(Employe employe) {
        this.employes.add(employe);
    }

    public static Object finByNom(String  S){
        -------------------------------------------------------------------------------------------
        for(Employe employeObj : employes){
           if(employeObj.nom.equals(S)){
               return employeObj ;
           }
        }
        return null ;
    }

    public static double countEmployes(double sl){
        int count= 0 ;
        for (Employe emp : employes){
            if (emp.getSalaire() == sl){
                count +=1 ;
            }

        }
        return count ;
    }

    public static void editEmployesNom(double sl , String newNom){
        for (Employe emp : employes){
            if (emp.getSalaire() == sl){
                emp.nom = newNom  ;
            }
        }
    }
}


public class EXAM_LAST_YEAR {
    public static void main(String[] Args){
        Agent Agent1 = new Agent(1000 , 3 , 1 , "Hmido Dib");
        Agent Agent2 = new Agent(1000 , 3 , 2 , "Ayman chapista");
        System.out.println(Agent1.ResumePaye());

        //Echelon Echelon1 = new Echelon();
        //System.out.println(Echelon1.getSalaire1(1));

        Medecin Medcin1 = new Medecin(3,"ayoub",3);
        Medecin Medcin2 = new Medecin(4,"oussama",3);
        System.out.println(Medcin1.ResumePaye());

        ListeEmployes listeEmp = new ListeEmployes();

        listeEmp.setEmployes(Agent1);
        listeEmp.setEmployes(Agent2);
        listeEmp.setEmployes(Medcin1);
        listeEmp.setEmployes(Medcin2);

        String SearchName = "Hmido Dib";
        Employe foundEmploye = (Employe) ListeEmployes.finByNom(SearchName);

        if (foundEmploye != null){
            System.out.println("Employe found :"+foundEmploye.ResumePaye());
        }
        else {
            System.out.println("Employe Not Found with name :"+SearchName);
        }

        System.out.println(ListeEmployes.countEmployes(3000));

        ListeEmployes.editEmployesNom(3000,"Zakaria");

        System.out.println(ListeEmployes.getEmployes());
}
}


