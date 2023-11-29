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

    abstract String ResumePaye();
}

class Agent extends Employe{
    private int NbHeures ;
    private int indice ;

    public Agent(int NbHeures , int indice , int noEmploye , String nom){
        super(noEmploye,nom);
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
    public String ResumePaye(){
        return ("Un Instance de Agent le numero D'employe est : "+this.noEmploye + " le nom d'employe est : "+this.nom+" le Salaire d'employe est : "+ this.indice);
    }
}

class Echelon {
    public final int ASSISTANT = 1 ;
    public final int CHEF_DE_CLINIQUE = 2 ;
    public final int CHEF_DE_SERVICE = 3 ;

    public String getSalaire1(int echelon){
        switch (echelon){
            case  ASSISTANT :
                JOptionPane.showMessageDialog(null , "3000");
                break;
            case CHEF_DE_CLINIQUE :
                JOptionPane.showMessageDialog(null,"5000");
                break;
            case CHEF_DE_SERVICE :
                JOptionPane.showMessageDialog(null,"8000");
                break;
            default:
                JOptionPane.showMessageDialog(null,"0.0");
                break;
        }

        return "";
    }
}

class Medecin extends Employe{
    private int echelon ;

    public Medecin(int noEmploye , String nom,int echelon){
        super(noEmploye, nom);
        this.echelon = echelon ;
    }

    public double getSalaire(){
        switch (echelon){
            case  1 :
                return 3000.0;
            case 2 :
                return 5000.0;
            case 3 :
                return 8000.0;
            default:
                return 0.0;
        }

    }
    public String ResumePaye(){
        return ("Un Instance de Medcin : le numero D'employe est : "+this.noEmploye + " le nom d'employe est : "+this.nom+" qui est un "+ (this.getSalaire() == 3000 ? "Assisstant":this.getSalaire() == 5000 ? "Chef de Clinique":this.getSalaire() == 8000 ?"Chef service" : "Na3ess fe dar"));
    }
}


class ListeEmployes {
    public static ArrayList employes = new ArrayList(30)  ;

    public static String getEmployes() {
        for (Object employeObj : employes){
            Employe employe = (Employe) employeObj ;
            System.out.println(employe.nom);
        }
        return "";

    }

    public void setEmployes(Employe employe) {
        this.employes.add(employe);
    }

    public static Object finByNom(String S){
        for(Object employeObj : employes){
            Employe employe = (Employe) employeObj;
           if(employe.nom.equals(S)){
               return employe ;
           }
        }
        return null ;
    }

    public static double countEmployes(double sl){
        int count= 0 ;
        for (Object emp : employes){
            Employe employe = (Employe) emp;
            if (employe.getSalaire() == sl){
                count +=1 ;
            }

        }
        return count ;
    }

    public static void editEmployes(double sl , String newNom){
        for (Object emp : employes){
            Employe employe = (Employe) emp ;
            if (employe.getSalaire() ==sl){
                employe.nom = newNom  ;
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

        ListeEmployes.editEmployes(3000,"Zakaria");

        System.out.println(ListeEmployes.getEmployes());
    }
}


