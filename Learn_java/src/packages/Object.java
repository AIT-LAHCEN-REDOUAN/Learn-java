package packages;

public class Object {
    public static void main(String[] Args ){
        Integer i = new Integer(12);
        int j= 89 ;
        Boolean b = new Boolean("true");
        Double d = new Double("12.2");
        d+=i;
        System.out.println(d);

        
        String s1 = "452";
        int ii = Integer.parseInt(s1);
        System.out.println(ii);

        double dd = Double.parseDouble(s1);
        System.out.println(dd);

        int nn = Integer.MAX_VALUE;
        System.out.println(nn);

    }
}
