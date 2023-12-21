package Serie5;

import java.util.ArrayList;

public class Ex2 {

    static double calculateSum(ArrayList<Double> list) {
        double sum = 0;
        for (Double value : list) {
            sum += value;
        }
        return sum;
    }

    static ArrayList<Double> incrementValues(double increment, ArrayList<Double> list) {
        ArrayList<Double> resultList = new ArrayList<>();
        for (Double value : list) {
            resultList.add(value + increment);
        }
        return resultList;
    }

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(20.0);
        list.add(10.0);
        list.add(50.0);
        list.add(60.0);

        System.out.println(calculateSum(list));

        // Example of using incrementValues method
        double incrementValue = 5.0;
        ArrayList<Double> incrementedList = incrementValues(incrementValue, list);
        System.out.println("Incremented List: " + incrementedList);
    }
}
