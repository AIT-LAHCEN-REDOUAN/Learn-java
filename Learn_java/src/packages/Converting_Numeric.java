package packages;



public class Converting_Numeric {

    public static void main(String Args[]){
        int valeurX = 100 ;
        int valeurY = -1000 ;
        double valeurZ = 1254.256;
        System.out.println("Valeur X = "+valeurX);

        long LongValeurX=valeurX;
        System.out.println(valeurX);

        short shortValeurX = (short) valeurX;
        byte byteValeurX = (byte) shortValeurX ;

        System.out.println(shortValeurX);
        System.out.println(byteValeurX);

        //9ima Motla9a
        System.out.println(Math.abs(valeurY));
        //9ima Ta9ribia
        System.out.println(Math.round(valeurZ));
        //AL Ouss
        System.out.println(Math.round(Math.pow(1200,2)));
    }
}
