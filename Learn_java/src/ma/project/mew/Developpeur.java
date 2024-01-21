package ma.project.mew;

import ma.project.Personne;

public class Developpeur extends Personne {
    private String specialite ;

    public Developpeur(int id, String nom, String prenom, String mail, String telephone, double salaire, String specialiste) {
        super(id, nom,prenom,mail , telephone ,  salaire);
        this.specialite = specialiste;
    }

    public String getSpecialite() {
        return this.specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public double calculerSalaire(){return this.salaire+this.salaire*0.2;};

    @Override
    public String toString() {
        return getSpecialite()+"   "+calculerSalaire();
    }
}
