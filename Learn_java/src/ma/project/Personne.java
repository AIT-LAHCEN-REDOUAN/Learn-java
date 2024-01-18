package ma.project;

import javax.naming.InvalidNameException;
import java.sql.SQLOutput;

abstract public class Personne {
    protected int id ;
    protected String nom ,prenom,mail,telephone ;
    protected double salaire ;

    protected Personne(int id, String nom, String prenom, String mail, String telephone, double salaire) {
        this.id = id ;

        if (nom.length() <5 || nom.length()>10){
            System.out.println("Must Between 5 and 10");
        }
        else {
            this.nom = nom ;
        }

        this.prenom = prenom ;
        if (!mail.contains("@")){
            System.out.println("Must Contains @");
        }
        else {
            this.mail=mail ;
        }

        this.telephone = telephone ;
        this.salaire = salaire;
    }
     protected abstract double  calculerSalaire();

    public abstract String toString();
}
