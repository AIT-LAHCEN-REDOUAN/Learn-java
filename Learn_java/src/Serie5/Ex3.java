package Serie5;

import java.util.ArrayList;

public class Ex3 {

    static void genere(int n){
        ArrayList<Integer> Liste = new ArrayList<Integer>();
        for (int i = 0 ; i<=n ; i++){
            if(i%2 != 0){
                Liste.add(i);
            }
        }
        System.out.println(Liste);
    }
    public static void main(String[] Args){
        genere(100);
    }
}