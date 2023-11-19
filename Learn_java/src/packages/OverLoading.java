package packages;

public class OverLoading {
    public static void main(String[] args){
        byte b = 12 ;
        short s = 43 ;
        int i = 90 ;
        long l = 123 ;
        OverLoading o = new OverLoading();
        //System.out.println(o.test(i,s));


    }

    public int test(int a ,int b){
        return a+b;
    }
    public String test(long a, char b){
        System.out.println("S");
        return ""+a+b ;

    }
    public double test(byte a , int b){
        System.out.println("D");
        return a+b;
    }
    public char test(long a , short b){
        System.out.println("C");
        return (char)(a+b);
    }}
