package OOP_Concept;

public class Vecteur {
    private double[] composantes;

    // Constructeur Vecteur (int n)
    public Vecteur(int n) {
        composantes = new double[n];
    }

    // Constructeur Vecteur (int n, double x)
    public Vecteur(int n, double x) {
        composantes = new double[n];
        for (int i = 0; i < n; i++) {
            composantes[i] = x;
        }
    }

    // Constructeur Vecteur (double[] v)
    public Vecteur(double[] v) {
        composantes = new double[v.length];
        System.arraycopy(v, 0, composantes, 0, v.length);
    }

    // Méthode prod_scal
    public double prod_scal(Vecteur autre) {
        if (composantes.length != autre.composantes.length) {
            return 0; // Les vecteurs ne sont pas de même taille, produit scalaire indéfini
        }

        double resultat = 0;
        for (int i = 0; i < composantes.length; i++) {
            resultat += composantes[i] * autre.composantes[i];
        }
        return resultat;
    }

    // Méthode somme (statique)
    public static Vecteur somme(Vecteur v1, Vecteur v2) {
        if (v1.composantes.length != v2.composantes.length) {
            return null; // Les vecteurs n'ont pas la même taille, renvoie une référence "nulle"
        }

        Vecteur resultat = new Vecteur(v1.composantes.length);
        for (int i = 0; i < v1.composantes.length; i++) {
            resultat.composantes[i] = v1.composantes[i] + v2.composantes[i];
        }
        return resultat;
    }

    // Méthode affiche
    public void affiche() {
        System.out.print("[ ");
        for (double composante : composantes) {
            System.out.print(composante + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Vecteur vecteur1 = new Vecteur(3, 2.0);
        Vecteur vecteur2 = new Vecteur(new double[]{1.0, 2.0, 3.0});

        System.out.println("Vecteur 1 :");
        vecteur1.affiche();

        System.out.println("Vecteur 2 :");
        vecteur2.affiche();

        System.out.println("Produit scalaire : " + vecteur1.prod_scal(vecteur2));

        Vecteur sommeVecteurs = Vecteur.somme(vecteur1, vecteur2);
        if (sommeVecteurs != null) {
            System.out.println("Somme des vecteurs :");
            sommeVecteurs.affiche();
        } else {
            System.out.println("Les vecteurs ne peuvent pas être additionnés (tailles différentes).");
        }
    }
}
