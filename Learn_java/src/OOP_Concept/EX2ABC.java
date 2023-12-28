package OOP_Concept;



abstract class Animal{
    protected String couleur ;
    protected int poids ;
    protected void manger(){
        System.out.println("Je Mange de la viande");
    }
    protected void boire(){
        System.out.println("je Bois de L'eau");
    }
    abstract void deplacement();
    abstract void crier();
    public String toString(){
        String str = "Je SUIS Un Objet de la "+this.getClass()+" , je Suis "+this.couleur + " , je pese "+this.poids ;
        return str ;
    }
}

abstract class Felin extends Animal {
    void deplacement(){
        System.out.println("je me deplace seul !" );
    }
}


abstract class Canin extends Animal {
    void deplacement(){
        System.out.println("je me deplace en meute !");
    }
}

class Chien extends Canin {
    public Chien(){

    }

    public Chien(String couleur , int poids){
        this.couleur = couleur ;
        this.poids = poids ;
    }

    void crier(){
        System.out.println("J'aboie sans raison !");
    }
}

class loup extends Canin {
    public loup(){

    }
    public loup(String couleur , int poids){
        this.couleur = couleur ;
        this.poids = poids ;
    }

    void crier(){
        System.out.println("Je Hurle a la lune !!");
    }
}

class Lion extends Felin {
    public Lion(){

    }

    public Lion(String couleur , int poids){
        this.couleur = couleur ;
        this.poids = poids;
    }

    void crier(){
        System.out.println("Je rugis dans la savane !");
    }
}

class Tigre extends Felin {
    public Tigre(){

    }
    public Tigre(String couleur , int poids){
        this.couleur = couleur ;
        this.poids = poids ;
    }

    void crier(){
        System.out.println("Je Groupe tres fort !");
    }
}

class Chat extends Felin {
    public Chat(){

    }
    public Chat(String couleur , int poids){
        this.couleur = couleur ;
        this.poids = poids ;
    }

    void crier(){
        System.out.println("Je miaule sur les toits !");
    }
}

public class EX2ABC {
    public static void main(String[] args){
        loup I = new loup("Gris bleut",20);
        I.boire();
        I.manger();
        I.deplacement();
        I.crier();
        System.out.println(I.toString());
    }
}
