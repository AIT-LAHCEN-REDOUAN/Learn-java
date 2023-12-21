package Projects_beginners;


class Stock {
    private int Shares ;
    private double Price ;
    private double Capital ;
     public void buy(double P , int S){
         Shares+=S ;
         Price = P ;
         Capital+=S*P ;
     }

     public void sell(double P , int S){
         Shares-=S ;
         Price = P ;
         Capital-=S*P ;
     }

     public int getShares(){
         return Shares ;
     }

     public double getPrice(){
         return Price ;
     }

     public double getAveragePrice(){
         return Capital / getShares() ;
     }
}
public class AverageStockPrice {
    public static void main(String[] Args){
       Stock abcCompany = new Stock();
       abcCompany.buy(36.6,2000);
       abcCompany.buy(39.7,3000);
       abcCompany.sell(42.9,1000);
        System.out.println(abcCompany.getShares());
        System.out.println(abcCompany.getPrice());
        System.out.println(abcCompany.getAveragePrice());
    }
}
