package Serie5;

import java.util.Vector;

class Figure {
    private int abscisse;
    private int ordonnee;
    private int couleur;
    private static Vector<Figure> instances = new Vector<>();

    public Figure(int abscisse, int ordonnee, int couleur) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
        this.couleur = couleur;
        instances.add(this);
    }

    public static Vector<Figure> getInstances() {
        return instances;
    }
}

class Carre extends Figure {
    private double cote;

    public Carre(int abscisse, int ordonnee, int couleur, double cote) {
        super(abscisse, ordonnee, couleur);
        this.cote = cote;
    }


    public static Vector<Figure> getInstances() {
        Vector<Figure> carreInstances = new Vector<>();
        for (Figure figure : Figure.getInstances()) {
            if (figure instanceof Carre) {
                carreInstances.add(figure);
            }
        }
        return carreInstances;
    }
}

class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    public Rectangle(int abscisse, int ordonnee, int couleur, double longueur, double largeur) {
        super(abscisse, ordonnee, couleur);
        this.longueur = longueur;
        this.largeur = largeur;
    }


    public static
    Vector<Figure> getInstances() {
        Vector<Figure> rectangleInstances = new Vector<>();
        for (Figure figure : Figure.getInstances()) {
            if (figure instanceof Rectangle) {
                rectangleInstances.add(figure);
            }
        }
        return rectangleInstances;
    }
}

public class Main {
    public static void main(String[] args) {
        Carre carre1 = new Carre(1, 2, 3, 4.5);
        Carre carre2 = new Carre(5, 6, 7, 8.0);

        Rectangle rectangle1 = new Rectangle(10, 20, 30, 40.0, 50.0);
        Rectangle rectangle2 = new Rectangle(15, 25, 35, 45.0, 55.0);

        // Exemple d'utilisation de getInstances()
        System.out.println("Toutes les instances de Figure : " + Figure.getInstances());
        System.out.println("Toutes les instances de Carre : " + carre1.getInstances());
        System.out.println("Toutes les instances de Rectangle : " + rectangle1.getInstances());
    }
}
