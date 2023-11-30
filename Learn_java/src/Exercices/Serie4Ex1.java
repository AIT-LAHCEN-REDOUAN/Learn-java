package Exercices;

public class Serie4Ex1 {
    public String cin ;
    public String S ;
    public  String Cours ;
    public double Argent ;

    public Serie4Ex1(String Cin , String S,String Cours, double Argent){
        this.cin = Cin ;
        this.S=S ;
        this.Cours = Cours ;
        this.Argent = Argent ;
    }

    public double Payement(Serie4Ex1 Cours){
        if (Cours.Cours == "JAVA"){
            Cours.Argent-=2000 ;
            return Cours.Argent ;

        }
        else if (Cours.Cours =="ASP.NET"){
          Cours.Argent-=3000;
          return Cours.Argent ;
        }

        return 0.0;

    }


    public static void main(String[] Args){
        Serie4Ex1 offer = new Serie4Ex1("KL123","ayman","ASP.NET",6000);
        System.out.println(offer.Payement(offer));
    }

}
