package OOP_Concept;

import java.util.*;

class Stagiaire{
    private String nom ;
    private List<Integer> notes ;
    private String entreprise ;
    private List<Service> service ;

    public Stagiaire(String nom , String entreprise , List<Integer> notes ,List<Service> service){
        this.nom = nom ;
        this.entreprise = entreprise ;
        this.notes = notes ;
        this.service = service ;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Integer> getNotes() {
        return notes;
    }

    public void setNotes(List<Integer> notes) {
        this.notes = notes;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    public List<Service> getService() {
        return service;
    }

    public void setService(List<Service> service) {
        this.service = service;
    }

    public double CalculerMoyenne(){
        int totalNote = 0 ;
        for(Object ele : notes){
            totalNote += (Integer) ele ;
        };
        return totalNote/notes.size();
    }

    public int trouverMax(){
        return Collections.max(notes);
    }

    public int trouverMin(){
        return Collections.min(notes);
    }

}

class Service{
    public String nomService ;
}

class ListeStagiaire {
    public  List<Stagiaire> stagiaires = new ArrayList<Stagiaire>(10);
}


abstract class Module{
    private String intitule ;
    private int nbrjours ;

    public Module(String intitule,int nbrjours ){
        this.intitule = intitule ;
        this.nbrjours = nbrjours;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }


    public int getNbrjours() {
        return nbrjours;
    }

    public void setNbrjours(int nbrjours) {
        this.nbrjours = nbrjours;
    }
}

class ModuleTp extends Module {

    private ListeStagiaire stagiaires ;

    public ModuleTp(ListeStagiaire stagiaires , String intitule , int nbrjours){
        super(intitule,nbrjours);
        this.stagiaires = stagiaires;
    }

    public ListeStagiaire getStagiaires() {
        return stagiaires;
    }

    public void setStagiaires(ListeStagiaire stagiaires) {
        this.stagiaires = stagiaires;
    }

    public double CalculerMoyenneModuleTP(){
        double TotalMoyenne = 0 ;
        for(Stagiaire ele : stagiaires.stagiaires){
             TotalMoyenne+=ele.CalculerMoyenne();
        }
        return TotalMoyenne/stagiaires.stagiaires.size();
    }

    public String afficherNomMax(){
        double max = this.stagiaires.stagiaires.get(0).CalculerMoyenne();
        String getNomMax = "" ;

        for(int i = 0 ; i<this.stagiaires.stagiaires.size();i++){
            if (this.stagiaires.stagiaires.get(i).CalculerMoyenne()>max){
                max =this.stagiaires.stagiaires.get(i).CalculerMoyenne();
                getNomMax = this.stagiaires.stagiaires.get(i).getNom();
            }
        }

        return getNomMax ;
    }

    public void ModifierNoteParStagiare(Stagiaire Nstg , List<Integer> NewNotes){
        for ( Stagiaire stg : this.stagiaires.stagiaires){
            if (stg.equals(Nstg)){
                stg.setNotes(NewNotes);
            }
        }
    }

    public int afficherMinMax(){
        double max = this.stagiaires.stagiaires.get(0).CalculerMoyenne();
        List<Integer> MaxNotes = null;
        for (int i = 0 ; i<this.stagiaires.stagiaires.size() ; i++){
            if (this.stagiaires.stagiaires.get(i).CalculerMoyenne()>max){
                MaxNotes = this.stagiaires.stagiaires.get(i).getNotes();
            }
        }
        
        return Collections.min(MaxNotes);
    }

    public int countStagiareService(String service){
        int count = 0 ;
        for (int i = 0 ; i<this.stagiaires.stagiaires.size();i++){
            for (int j = 0 ; j < this.stagiaires.stagiaires.get(i).getService().size();j++){
                if (this.stagiaires.stagiaires.get(i).getService().get(j).equals(service)){
                    count +=1  ;
                }
            }
        }

        return count ;
    }

    public double trouverMoyenneParNom(String nom){
        Stagiaire stg = null;
        for (int i = 0; i<this.stagiaires.stagiaires.size();i++){
            if (this.stagiaires.stagiaires.get(i).getNom() == nom){
                stg = this.stagiaires.stagiaires.get(i);
            }
        }
        return stg.CalculerMoyenne();
    }

    public void Ajouter(Stagiaire stg){
        this.stagiaires.stagiaires.add(stg);

    }
}

public class EXAM_2 {
   public static void main(String[] args){

       Stagiaire stg1 = new Stagiaire("Alice", "Company A", Arrays.asList(80, 85, 90), new ArrayList<>());
       Stagiaire stg2 = new Stagiaire("Bob", "Company B", Arrays.asList(70, 75, 80), new ArrayList<>());
       Stagiaire stg3 = new Stagiaire("Charlie", "Company C", Arrays.asList(85, 90, 95), new ArrayList<>());

       // Adding Stagiaire objects to ListeStagiaire
       ListeStagiaire listeStagiaire = new ListeStagiaire();
       listeStagiaire.stagiaires.add(stg1);
       listeStagiaire.stagiaires.add(stg2);
       listeStagiaire.stagiaires.add(stg3);

       // Creating a ModuleTp object
       ModuleTp moduleTp = new ModuleTp(listeStagiaire, "Java Programming", 30);

       // Calculating average of ModuleTp
       double moyenneModuleTP = moduleTp.CalculerMoyenneModuleTP();
       System.out.println("Average of ModuleTp: " + moyenneModuleTP);

       // Finding the name of the stagiaire with the highest average
       String nomMax = moduleTp.afficherNomMax();
       System.out.println("Stagiaire with the highest average: " + nomMax);

       // Modifying notes for a Stagiaire
       moduleTp.ModifierNoteParStagiare(stg2, Arrays.asList(75, 80, 85));

       // Finding the minimum note among the highest averages
       int minMax = moduleTp.afficherMinMax();
       System.out.println("Minimum note among the highest averages: " + minMax);

       // Counting Stagiaire with a specific service
       int countService = moduleTp.countStagiareService("ServiceA");
       System.out.println("Number of Stagiaire in ServiceA: " + countService);

       // Finding the average for a specific stagiaire
       double moyenneParNom = moduleTp.trouverMoyenneParNom("Bob");
       System.out.println("Average for Bob: " + moyenneParNom);

       // Adding a new Stagiaire
       Stagiaire stg4 = new Stagiaire("David", "Company D", Arrays.asList(90, 95, 100), new ArrayList<>());
       moduleTp.Ajouter(stg4);
       System.out.println("Added Stagiaire David.");
   }
}
