package packages;

public class While {

    public static  void main(String Args[]){
        int i = 0 ;
        int j = 0 ;

        while (i<2){
            while (j>=0){
                System.out.print(i);
                System.out.print(".");
                System.out.print(j);
                j++;

                if (j>2){
                    break;

                }

            }
            i++ ;
            j=0;
        }
    }
}
