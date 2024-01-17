package Serie_6;

import java.util.LinkedList;

class Voiture {
    private String constructeur;
    private String modele;
    private double prix;
    private int annee;

    public Voiture(String constructeur, String modele, double prix, int annee) {
        this.constructeur = constructeur;
        this.modele = modele;
        this.prix = prix;
        this.annee = annee;
    }

    public void affiche() {
        System.out.println("Constructeur: " + constructeur + ", Modèle: " + modele + ", Prix: " + prix + ", Année: " + annee);
    }
}

class Garage1 {
    private String nom;
    private Voiture[] voitures;

    public Garage1(String nom, Voiture[] voitures) {
        this.nom = nom;
        this.voitures = voitures;
    }

    public void affiche() {
        System.out.println("Nom du garage: " + nom);
        System.out.println("Voitures dans le garage:");
        for (Voiture voiture : voitures) {
            voiture.affiche();
        }
    }
}

class Garage2 {
    private String nom;
    private LinkedList<Voiture> voitures;

    public Garage2(String nom) {
        this.nom = nom;
        this.voitures = new LinkedList<>();
    }

    public void affiche() {
        System.out.println("Nom du garage: " + nom);
        System.out.println("Voitures dans le garage:");
        for (Voiture voiture : voitures) {
            voiture.affiche();
        }
    }

    public void ajouter(Voiture v) {
        voitures.add(v);
    }

    public void supprimer(Voiture v) {
        voitures.remove(v);
    }
}

public class Ex5 {
    public static void main(String[] args) {
        // Test de Garage1
        Voiture[] voituresGarage1 = {
                new Voiture("Toyota", "Camry", 25000, 2022),
                new Voiture("Honda", "Civic", 22000, 2022),
                new Voiture("Ford", "Fusion", 27000, 2022)
        };
        Garage1 garage1 = new Garage1("Garage1", voituresGarage1);
        garage1.affiche();

        System.out.println();

        // Test de Garage2
        Garage2 garage2 = new Garage2("Garage2");
        garage2.ajouter(new Voiture("Tesla", "Model 3", 50000, 2022));
        garage2.ajouter(new Voiture("Chevrolet", "Malibu", 26000, 2022));
        garage2.ajouter(new Voiture("Nissan", "Altima", 24000, 2022));

        garage2.affiche();

        // Supprimer une voiture du Garage2
        Voiture voitureASupprimer = new Voiture("Chevrolet", "Malibu", 26000, 2022);
        garage2.supprimer(voitureASupprimer);

        System.out.println("\nAprès suppression de la voiture :");
        garage2.affiche();
    }
}
