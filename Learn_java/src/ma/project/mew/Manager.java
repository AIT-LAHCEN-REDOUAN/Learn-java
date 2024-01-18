package ma.project.mew;

import ma.project.Personne;

public class Manager extends Personne {
    private String service;

    public Manager(int id, String nom, String prenom, String mail, String telephone, double salaire, String Service){
        super(id, nom,prenom,mail , telephone ,  salaire);
        this.service =Service ;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double calculerSalaire(){return this.salaire+this.salaire*0.35;};

    @Override
    public String toString() {
        return getService()+"   "+calculerSalaire();
    }


}
