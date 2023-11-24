package Exercices;

public class Ex9 {
    private int abscisse; // Abscisse relative to the current origin
    private int origine; // Abscisse of the current origin

    public Ex9(int absoluteAbscisse) {
        this.abscisse = absoluteAbscisse;
        this.origine = 0; // Initial origin at 0
    }

    public void affiche() {
        System.out.println("Point - abscisse = " + this.abscisse +
                "\n relative a une origine d'abscisse " + this.origine);
    }

    public void setOrigine(int newOrigine) {
        this.origine = newOrigine;
    }

    public int getOrigine() {
        return this.origine;
    }

    public static void main(String[] args) {
        Ex9 pointA = new Ex9(3);
        Ex9 pointB = new Ex9(12);

        pointA.affiche();
        pointB.affiche();

        System.out.println("On place l'origine en 3");
        pointA.setOrigine(3);

        pointA.affiche();
        pointB.affiche();
    }
}
