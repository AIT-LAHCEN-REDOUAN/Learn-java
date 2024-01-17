package Serie_6;
public class Ex1 {
    private double[] composantes;


    public Ex1(int n) {
        composantes = new double[n];
    }

    public Ex1(int n, double x) {
        composantes = new double[n];
        for (int i = 0; i < n; i++) {
            composantes[i] = x;
        }
    }

    public Ex1(double[] v) {
        composantes = new double[v.length];
        System.arraycopy(v, 0, composantes, 0, v.length);
    }

    public double prod_scal(Ex1 autre) {
        if (composantes.length != autre.composantes.length) {

            return 0;
        }

        double produitScalaire = 0;
        for (int i = 0; i < composantes.length; i++) {
            produitScalaire += composantes[i] * autre.composantes[i];
        }
        return produitScalaire;
    }

    public static Ex1 somme(Ex1 v1, Ex1 v2) {
        if (v1.composantes.length != v2.composantes.length) {

            return null;
        }

        Ex1 resultat = new Ex1(v1.composantes.length);
        for (int i = 0; i < v1.composantes.length; i++) {
            resultat.composantes[i] = v1.composantes[i] + v2.composantes[i];
        }
        return resultat;
    }

    public void affiche() {
        System.out.print("[ ");
        for (double composante : composantes) {
            System.out.print(composante + " ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Ex1 v1 = new Ex1(3, 2.0);
        Ex1 v2 = new Ex1(new double[]{1.0, 3.0, 5.0});

        System.out.println("Vecteur 1 :");
        v1.affiche();

        System.out.println("Vecteur 2 :");
        v2.affiche();

        System.out.println("Produit scalaire : " + v1.prod_scal(v2));

        Ex1 somme = Ex1.somme(v1, v2);
        if (somme != null) {
            System.out.println("Somme des vecteurs :");
            somme.affiche();
        } else {
            System.out.println("Les vecteurs n'ont pas la même taille, impossible de faire la somme.");
        }
    }
}
