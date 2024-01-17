package Serie_6;

import java.util.ArrayList;
import java.util.Scanner;

class Voiture1 {
    private String code;
    private double puissanceMoteur;
    private String couleur;
    private int nombreDePlaces;

    public Voiture1(String code, double puissanceMoteur, String couleur, int nombreDePlaces) {
        this.code = code;
        this.puissanceMoteur = puissanceMoteur;
        this.couleur = couleur;
        this.nombreDePlaces = nombreDePlaces;
    }

    public static Voiture1 Saisie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisie d'une voiture:");
        System.out.print("Code : ");
        String code = scanner.next();
        System.out.print("Puissance moteur : ");
        double puissanceMoteur = scanner.nextDouble();
        System.out.print("Couleur : ");
        String couleur = scanner.next();
        System.out.print("Nombre de places : ");
        int nombreDePlaces = scanner.nextInt();

        return new Voiture1(code, puissanceMoteur, couleur, nombreDePlaces);
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "code='" + code + '\'' +
                ", puissanceMoteur=" + puissanceMoteur +
                ", couleur='" + couleur + '\'' +
                ", nombreDePlaces=" + nombreDePlaces +
                '}';
    }

    public double getPuissanceMoteur() {
        return puissanceMoteur;
    }

    public int getNombreDePlaces() {
        return nombreDePlaces;
    }
}

class Moto {
    private String code;
    private double puissanceMoteur;
    private double vitesse;
    private String couleur;

    public Moto(String code, double puissanceMoteur, double vitesse, String couleur) {
        this.code = code;
        this.puissanceMoteur = puissanceMoteur;
        this.vitesse = vitesse;
        this.couleur = couleur;
    }

    public static Moto Saisie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisie d'une moto:");
        System.out.print("Code : ");
        String code = scanner.next();
        System.out.print("Puissance moteur : ");
        double puissanceMoteur = scanner.nextDouble();
        System.out.print("Vitesse : ");
        double vitesse = scanner.nextDouble();
        System.out.print("Couleur : ");
        String couleur = scanner.next();

        return new Moto(code, puissanceMoteur, vitesse, couleur);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "code='" + code + '\'' +
                ", puissanceMoteur=" + puissanceMoteur +
                ", vitesse=" + vitesse +
                ", couleur='" + couleur + '\'' +
                '}';
    }

    public double getPuissanceMoteur() {
        return puissanceMoteur;
    }

    public double getVitesse() {
        return vitesse;
    }
}

class Camion {
    private String code;
    private double puissanceMoteur;
    private double capaciteRemorque;
    private String couleur;

    public Camion(String code, double puissanceMoteur, double capaciteRemorque, String couleur) {
        this.code = code;
        this.puissanceMoteur = puissanceMoteur;
        this.capaciteRemorque = capaciteRemorque;
        this.couleur = couleur;
    }

    public static Camion Saisie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisie d'un camion:");
        System.out.print("Code : ");
        String code = scanner.next();
        System.out.print("Puissance moteur : ");
        double puissanceMoteur = scanner.nextDouble();
        System.out.print("Capacité de la remorque : ");
        double capaciteRemorque = scanner.nextDouble();
        System.out.print("Couleur : ");
        String couleur = scanner.next();

        return new Camion(code, puissanceMoteur, capaciteRemorque, couleur);
    }

    @Override
    public String toString() {
        return "Camion{" +
                "code='" + code + '\'' +
                ", puissanceMoteur=" + puissanceMoteur +
                ", capaciteRemorque=" + capaciteRemorque +
                ", couleur='" + couleur + '\'' +
                '}';
    }

    public double getPuissanceMoteur() {
        return puissanceMoteur;
    }

    public double getCapaciteRemorque() {
        return capaciteRemorque;
    }
}

class LesVoitures {
    private Voiture1[] voitures;

    public LesVoitures(Voiture1[] voitures) {
        this.voitures = voitures;
    }

    public void Affichage() {
        for (Voiture1 voiture : voitures) {
            System.out.println(voiture);
        }
    }

    public void Ajout(Voiture1 voiture) {
        // Dans une application réelle, on pourrait redimensionner le tableau si nécessaire
    }

    public void Recherche(String code) {
        for (Voiture1 voiture : voitures) {
            if (voiture.toString().contains(code)) {
                System.out.println("Voiture trouvée : " + voiture);
                return;
            }
        }
        System.out.println("Aucune voiture trouvée avec le code : " + code);
    }

    public double Moyenne() {
        if (voitures.length == 0) {
            return 0.0;
        }

        double totalPuissance = 0;
        for (Voiture1 voiture : voitures) {
            totalPuissance += voiture.getPuissanceMoteur();
        }

        return totalPuissance / voitures.length;
    }

    public Voiture1 Max() {
        if (voitures.length == 0) {
            return null;
        }

        Voiture1 maxVoiture = voitures[0];
        for (Voiture1 voiture : voitures) {
            if (voiture.getNombreDePlaces() > maxVoiture.getNombreDePlaces()) {
                maxVoiture = voiture;
            }
        }

        return maxVoiture;
    }
}

class LesMotos {
    private ArrayList<Moto> motos;

    public LesMotos(ArrayList<Moto> motos) {
        this.motos = motos;
    }

    public void Affichage() {
        for (Moto moto : motos) {
            System.out.println(moto);
        }
    }

    public void Ajout(Moto moto) {
        motos.add(moto);
    }

    public void Recherche(String code) {
        for (Moto moto : motos) {
            if (moto.toString().contains(code)) {
                System.out.println("Moto trouvée : " + moto);
                return;
            }
        }
        System.out.println("Aucune moto trouvée avec le code : " + code);
    }

    public double Moyenne() {
        if (motos.isEmpty()) {
            return 0.0;
        }

        double totalVitesse = 0;
        for (Moto moto : motos) {
            totalVitesse += moto.getVitesse();
        }

        return totalVitesse / motos.size();
    }

    public Moto Max() {
        if (motos.isEmpty()) {
            return null;
        }

        Moto maxMoto = motos.get(0);
        for (Moto moto : motos) {
            if (moto.getPuissanceMoteur() > maxMoto.getPuissanceMoteur()) {
                maxMoto = moto;
            }
        }

        return maxMoto;
    }
}

class LesCamions {
    private ArrayList<Camion> camions;

    public LesCamions(ArrayList<Camion> camions) {
        this.camions = camions;
    }

    public void Affichage() {
        for (Camion camion : camions) {
            System.out.println(camion);
        }
    }

    public void Ajout(Camion camion) {
        camions.add(camion);
    }

    public void Recherche(String code) {
        for (Camion camion : camions) {
            if (camion.toString().contains(code)) {
                System.out.println("Camion trouvé : " + camion);
                return;
            }
        }
        System.out.println("Aucun camion trouvé avec le code : " + code);
    }

    public double Moyenne() {
        if (camions.isEmpty()) {
            return 0.0;
        }

        double totalCapacite = 0;
        for (Camion camion : camions) {
            totalCapacite += camion.getCapaciteRemorque();
        }

        return totalCapacite / camions.size();
    }

    public Camion Max() {
        if (camions.isEmpty()) {
            return null;
        }

        Camion maxCamion = camions.get(0);
        for (Camion camion : camions) {
            if (camion.getCapaciteRemorque() > maxCamion.getCapaciteRemorque()) {
                maxCamion = camion;
            }
        }

        return maxCamion;
    }
}

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez une option :");
        System.out.println("1. Voiture");
        System.out.println("2. Moto");
        System.out.println("3. Camion");

        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                LesVoitures lesVoitures = new LesVoitures(new Voiture1[]{
                        new Voiture1("V1", 150, "Rouge", 5),
                        new Voiture1("V2", 120, "Bleu", 4),
                        new Voiture1("V3", 180, "Noir", 7)
                });

                lesVoitures.Affichage();
                System.out.println("Moyenne de puissance : " + lesVoitures.Moyenne());
                Voiture1 voitureMax = lesVoitures.Max();
                System.out.println("Voiture avec le plus de places : " + voitureMax);

                System.out.println("Saisissez une voiture : ");
                Voiture1 nouvelleVoiture = Voiture1.Saisie();
                lesVoitures.Ajout(nouvelleVoiture);
                lesVoitures.Affichage();
                break;

            case 2:
                LesMotos lesMotos = new LesMotos(new ArrayList<>());

                lesMotos.Ajout(Moto.Saisie());
                lesMotos.Ajout(Moto.Saisie());
                lesMotos.Ajout(Moto.Saisie());

                lesMotos.Affichage();
                System.out.println("Moyenne de vitesse : " + lesMotos.Moyenne());
                Moto motoMax = lesMotos.Max();
                System.out.println("Moto avec la puissance moteur la plus élevée : " + motoMax);
                break;

            case 3:
                LesCamions lesCamions = new LesCamions(new ArrayList<>());

                lesCamions.Ajout(Camion.Saisie());
                lesCamions.Ajout(Camion.Saisie());
                lesCamions.Ajout(Camion.Saisie());

                lesCamions.Affichage();
                System.out.println("Moyenne de capacité de remorque : " + lesCamions.Moyenne());
                Camion camionMax = lesCamions.Max();
                System.out.println("Camion avec la capacité de remorque la plus grande : " + camionMax);
                break;

            default:
                System.out.println("Choix invalide.");
        }
    }
}
