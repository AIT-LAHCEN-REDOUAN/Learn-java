package Figures;

public class TriangleGauche extends Figure {
    TriangleGauche(int NombreLignes , String motif){
        super( NombreLignes,motif);
    }
    @Override
    public String toString() {
        return "le Nombre De Lignes et :"+this.NombreLignes+" le motif est : "+this.motif ;
    }
}
