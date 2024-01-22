package Figures;

public class Pyramide extends Figure {
    public Pyramide(int NombreLignes , String motif){
        super(NombreLignes,motif);

    }

    @Override
    public String toString() {
        return "le Nombre De Lignes et :"+this.NombreLignes+" le motif est : "+this.motif ;
    }
}
