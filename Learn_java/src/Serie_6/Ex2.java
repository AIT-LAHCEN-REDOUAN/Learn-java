package Serie_6;

public class Ex2 {


    public static void affiche(double[][] tableau) {
        for (double[] ligne : tableau) {
            for (double valeur : ligne) {
                System.out.print(valeur + " ");
            }
            System.out.println();
        }
    }


    public static boolean regulier(double[][] tableau) {
        int taillePremiereLigne = tableau[0].length;
        for (double[] ligne : tableau) {
            if (ligne.length != taillePremiereLigne) {
                return false;
            }
        }
        return true;
    }


    public static double[] sommeLignes(double[][] tableau) {
        double[] sommes = new double[tableau.length];
        for (int i = 0; i < tableau.length; i++) {
            for (double valeur : tableau[i]) {
                sommes[i] += valeur;
            }
        }
        return sommes;
    }


    public static double[][] somme(double[][] t1, double[][] t2) {
        if (!regulier(t1) || !regulier(t2) || t1.length != t2.length || t1[0].length != t2[0].length) {

            return null;
        }

        int lignes = t1.length;
        int colonnes = t1[0].length;
        double[][] resultat = new double[lignes][colonnes];

        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                resultat[i][j] = t1[i][j] + t2[i][j];
            }
        }

        return resultat;
    }

    public static void main(String[] args) {

        double[][] tableau1 = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        };

        double[][] tableau2 = {
                {9.0, 8.0, 7.0},
                {6.0, 5.0, 4.0},
                {3.0, 2.0, 1.0}
        };

        System.out.println("Tableau 1 :");
        affiche(tableau1);

        System.out.println("Tableau 2 :");
        affiche(tableau2);

        if (regulier(tableau1)) {
            System.out.println("Le tableau 1 est régulier.");
        } else {
            System.out.println("Le tableau 1 n'est pas régulier.");
        }

        double[] sommes = sommeLignes(tableau1);
        System.out.println("Somme des lignes du tableau 1 :");
        for (double somme : sommes) {
            System.out.print(somme + " ");
        }
        System.out.println();

        double[][] sommeTableaux = somme(tableau1, tableau2);
        if (sommeTableaux != null) {
            System.out.println("Somme des tableaux :");
            affiche(sommeTableaux);
        } else {
            System.out.println("Les tableaux n'ont pas les mêmes dimensions, impossible de faire la somme.");
        }
    }
}

