package packages;
import java.math.BigDecimal;
public class BigDecimale {
    public static void main(String Args[]){
        double v = .015 ;
        String valeurTexte = Double.toString(v);
        BigDecimal valeurBig = new BigDecimal(valeurTexte);
        BigDecimal TotalBig = valeurBig.add(valeurBig.add(valeurBig).add(valeurBig));
        System.out.println(TotalBig);
    }

}
