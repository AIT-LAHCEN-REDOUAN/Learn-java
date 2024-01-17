package Serie_6;


interface Affichable {
    void affiche();
}


 interface Transformable {
    void homothetie(double coeff);
    void rotation(double angle);
}


public class Ex3 implements Affichable, Transformable {
    private double rayon;

    public Ex3(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public void affiche() {
        System.out.println("Cercle de rayon " + rayon);
    }

    @Override
    public void homothetie(double coeff) {
        rayon *= coeff;
        System.out.println("Homothétie du cercle avec un coefficient de " + coeff);
    }

    @Override
    public void rotation(double angle) {
        System.out.println("Rotation du cercle avec un angle de " + angle);
        // Implémentation de la rotation (à adapter en fonction des besoins réels)
    }


}


class Main {
    public static void main(String[] args) {

        Ex3 cercle = new Ex3(5.0);


        cercle.affiche();
        cercle.homothetie(2.0);
        cercle.rotation(45.0);
    }
}

