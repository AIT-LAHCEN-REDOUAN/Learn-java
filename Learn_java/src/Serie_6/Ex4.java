package Serie_6;

class Personne {
    private String nom;
    private String prenom;
    private String dateNaissance;

    public Personne(String nom, String prenom, String dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public void afficher() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Date de naissance: " + dateNaissance);
    }
}

class Employe extends Personne {
    private double salaire;

    public Employe(String nom, String prenom, String dateNaissance, double salaire) {
        super(nom, prenom, dateNaissance);
        this.salaire = salaire;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Salaire: " + salaire);
    }
}

class Chef extends Employe {
    private String service;

    public Chef(String nom, String prenom, String dateNaissance, double salaire, String service) {
        super(nom, prenom, dateNaissance, salaire);
        this.service = service;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Service: " + service);
    }
}

class Directeur extends Chef {
    private String societe;

    public Directeur(String nom, String prenom, String dateNaissance, double salaire, String service, String societe) {
        super(nom, prenom, dateNaissance, salaire, service);
        this.societe = societe;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Société: " + societe);
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Personne[] personnes = new Personne[8];

        personnes[0] = new Employe("Nom1", "Prenom1", "01/01/1990", 30000);
        personnes[1] = new Employe("Nom2", "Prenom2", "02/02/1995", 35000);
        personnes[2] = new Employe("Nom3", "Prenom3", "03/03/1992", 40000);
        personnes[3] = new Chef("Nom4", "Prenom4", "04/04/1985", 45000, "Service1");
        personnes[4] = new Chef("Nom5", "Prenom5", "05/05/1988", 50000, "Service2");
        personnes[5] = new Directeur("Nom6", "Prenom6", "06/06/1980", 70000, "Service3", "Societe1");
        personnes[6] = new Employe("Nom7", "Prenom7", "07/07/1998", 38000);
        personnes[7] = new Directeur("Nom8", "Prenom8", "08/08/1975", 80000, "Service4", "Societe2");

        System.out.println("Affichage avec for :");
        for (int i = 0; i < personnes.length; i++) {
            personnes[i].afficher();
        }

        System.out.println("\nAffichage avec foreach :");
        for (Personne personne : personnes) {
            personne.afficher();
        }
    }
}

