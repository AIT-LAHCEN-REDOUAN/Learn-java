package Exercices;

class Client {
    private String CIN;
    private String Nom;
    private String Prenom;
    private String Tel;

    public Client(String CIN, String Nom, String Prenom, String Tel) {
        this.CIN = CIN;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Tel = Tel;
    }

    public String getCIN() {
        return CIN;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getTel() {
        return Tel;
    }

    public void afficher() {
        System.out.println("Client " + Nom + " " + Prenom + " (CIN: " + CIN + ", Tel: " + Tel + ")");
    }
}

class Compte {
    private static int nombreComptes = 0;
    private int numeroCompte;
    private double solde;
    private Client proprietaire;

    public Compte(Client proprietaire, double solde) {
        this.proprietaire = proprietaire;
        this.solde = solde;
        this.numeroCompte = ++nombreComptes;
    }

    public Compte(Client proprietaire) {
        this(proprietaire, 0);
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void crediter(double montant) {
        solde += montant;
    }

    public void crediter(double montant, Compte autreCompte) {
        solde += montant;
        autreCompte.debiter(montant);
    }

    public void debiter(double montant) {
        if (solde >= montant) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant.");
        }
    }

    public void debiter(double montant, Compte autreCompte) {
        if (solde >= montant) {
            solde -= montant;
            autreCompte.crediter(montant);
        } else {
            System.out.println("Solde insuffisant.");
        }
    }

    public void afficherResume() {
        System.out.println("Compte " + numeroCompte + " (Propriétaire: " + proprietaire.getNom() + " "
                + proprietaire.getPrenom() + ", Solde: " + solde + ")");
    }

    public static int getNombreComptes() {
        return nombreComptes;
    }
}

public class TestCompte {
    public static void main(String[] args) {
        Client client1 = new Client("12345", "Dupont", "Pierre", "0123456789");
        Client client2 = new Client("67890", "Martin", "Sophie", "0987654321");

        Compte compte1 = new Compte(client1, 1000);
        Compte compte2 = new Compte(client2);

        compte1.crediter(500);
        compte2.debiter(200);

        compte1.crediter(300, compte2);

        client1.afficher();
        compte1.afficherResume();
        client2.afficher();
        compte2.afficherResume();

        System.out.println("Nombre de comptes créés: " + Compte.getNombreComptes());
    }
}
