package OOP_Concept;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class vector {
    public static void main(String[] args) throws InterruptedException {
        // Creating an ArrayList and a Vector
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> vector = new Vector<>();

        // Number of elements to add
        int numElements = 1000000;

        // Runnable for adding elements to ArrayList with a delay
        Runnable addArrayList = () -> {
            for (int i = 0; i < numElements; i++) {
                arrayList.add(i);
                try {
                    Thread.sleep(1); // Simulating some processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Runnable for adding elements to Vector with a delay
        Runnable addVector = () -> {
            for (int i = 0; i < numElements; i++) {
                vector.add(i);
                try {
                    Thread.sleep(1); // Simulating some processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Create two threads for adding elements to ArrayList and Vector simultaneously
        Thread thread1 = new Thread(addArrayList);
        Thread thread2 = new Thread(addVector);

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Print the sizes of ArrayList and Vector
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("Vector size: " + vector.size());
    }
}
