package OOP_Concept;
import java.util.ArrayList;
import java.util.Vector;

public class vector {
    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> v = new Vector<>();
        ArrayList<Integer> a = new ArrayList<>();
        int s = 10000000;

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < s; i++) {
                v.add(i);
            }

            System.out.println("Vector size: " + v.size());
        });

        Thread t2 = new Thread(() -> {
            for (int j = 0; j < s; j++) {
                a.add(j);

            }
            System.out.println("ArrayList size: " + a.size());
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();



    }
}
