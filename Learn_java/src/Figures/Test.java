package Figures;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] Args){
        TriangleGauche TG1 = new TriangleGauche(5,"Triangle Gauche 1");
        TriangleGauche TG2 = new TriangleGauche(3,"Triangle Gauche 2");

        TriangleDroit TD1 = new TriangleDroit(4,"Triangle Droit 1 ");
        TriangleDroit TD2 = new TriangleDroit(6,"Triangle Droit 2 ");

        Pyramide PY1 = new Pyramide(10,"Pyramide 1");
        Pyramide PY2 = new Pyramide(15,"Pyramide 2");

        List<Figure> L = new ArrayList<>();
        L.add(TG1);
        L.add(TG2);

        L.add(TD1);
        L.add(TD2);

        L.add(PY1);
        L.add(PY2);

       for (Figure obj : L){
           System.out.println( obj.motif+ " le Nombre de Ligne est : "+obj.NombreLignes);
       }

    }
}
