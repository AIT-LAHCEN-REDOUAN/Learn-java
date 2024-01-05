package Serie5;

class NombreHabitantException extends Exception {
    NombreHabitantException() {
        System.out.println("Vous essayez");
    }
}

 class Ville {

    private String nomVille;
    private String nomPays;
    private int nbreHabitants;
    private char categorie;

    static int nbreInstance = 0;
    static int nbreInstanceBis = 0;

    public Ville(String pNom, int pNbre, String pPays) throws NombreHabitantException {
        if (pNbre < 0)
            throw new NombreHabitantException();
        else {
            nbreInstance++;
            nbreInstanceBis++;
            nomVille = pNom;
            nomPays = pPays;
            nbreHabitants = pNbre;
            this.setCategorie();
        }
    }

    public String getNom() {
        return nomVille;
    }

    public String getNomPays() {
        return nomPays;
    }

    public int getNombreHabitants() {
        return nbreHabitants;
    }

    public char getCategorie() {
        return categorie;
    }

    public void setNom(String pNom) {
        nomVille = pNom;
    }

    public void setNomPays(String pPays) {
        nomPays = pPays;
    }

    public void setNombreHabitants(int nbre) {
        nbreHabitants = nbre;
        this.setCategorie();
    }

    private void setCategorie() {
        int[] bornesSuperieures = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
        char[] categories = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

        int i = 0;
        while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
            i++;

        this.categorie = categories[i];
    }

    public String decrisToi() {
        return "\t" + this.nomVille + " est une ville de " + this.nomPays + ", elle comporte : " + this.nbreHabitants + " habitant(s) => elle est donc de catégorie : " + this.categorie;
    }

    public String comparer(Ville v1) {
        String str;

        if (v1.getNombreHabitants() > this.nbreHabitants)
            str = v1.getNom() + " est une ville plus peuplée que " + this.nomVille;
        else
            str = this.nomVille + " est une ville plus peuplée que " + v1.getNom();

        return str;
    }

    public static void main(String[] args) {
        Ville v = null;
        try {
            v = new Ville("Rennes", 12000, "France");
        } catch (NombreHabitantException e) {
            e.printStackTrace();
        } finally {
            if (v == null) {
                try {
                    v = new Ville("Rennes", 12000, "France");
                } catch (NombreHabitantException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println(v.decrisToi());
    }
}

class Capitale extends Ville {

    private String monument;

    public Capitale() throws NombreHabitantException {
        super("", 0, ""); // Call to super() should have appropriate values; adjust accordingly
        monument = "aucun";
    }

    public Capitale(String nom, int hab, String pays, String monument) throws NombreHabitantException {
        super(nom, hab, pays);
        this.monument = monument;
    }

    public String decrisToi() {
        String str = super.decrisToi() + "\n \t ==>>" + this.monument + " en est un monument";
        return str;
    }

    public String getMonument() {
        return monument;
    }

    public void setMonument(String monument) {
        this.monument = monument;
    }
}

public class JavaException {
    public static void main(String[] args) {
        // Test Ville creation with valid parameters
        try {
            Ville ville1 = new Ville("Paris", 2200000, "France");
            System.out.println(ville1.decrisToi());
        } catch (NombreHabitantException  e) {
            e.printStackTrace();
        }

        // Test Ville creation with negative population (should throw an exception)
        try {
            Ville ville2 = new Ville("Smallville", -100, "Metropolis");
        } catch (NombreHabitantException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Test Capitale creation with valid parameters
        try {
            Capitale capitale1 = new Capitale("Berlin", 3500000, "Germany", "Brandenburg Gate");
            System.out.println(capitale1.decrisToi());
        } catch (NombreHabitantException e) {
            e.printStackTrace();
        }

        // Test Capitale creation with negative population (should throw an exception)
        try {
            Capitale capitale2 = new Capitale("Gotham", -500000, "USA", "Bat-Signal");
            System.out.println(capitale2.toString());
        } catch (NombreHabitantException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

