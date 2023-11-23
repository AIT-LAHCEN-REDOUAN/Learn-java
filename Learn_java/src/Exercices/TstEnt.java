package Exercices;

public class TstEnt {
    public static void main(String args[]) {
        Ex7 n1 = new Ex7(2);
        System.out.print("n1 = ");
        n1.imprime();
        Ex7 n2 = new Ex7(5);
        System.out.print("n1 = ");
        n2.imprime();
        n1.incr(3);
        System.out.print("n1 = ");
        n1.imprime();
        System.out.println("n1 == n2 est " + (n1 == n2));
        n1 = n2;
        n2.incr(12);
        System.out.print("n2 = ");
        n2.imprime();
        System.out.print("n1 = ");
        n1.imprime();
        System.out.println("n1 == n2 est " + (n1 == n2));
    }
}
