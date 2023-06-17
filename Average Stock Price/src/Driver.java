public class Driver {
     public static void main(String[] args) {
        Stock Aa_Company = new Stock();
        Aa_Company.buy(36.6, 2000);
        Aa_Company.buy(39.7, 3000);
        Aa_Company.sell(42.9, 1000);
        System.out.println(Aa_Company.getShares());
        System.out.println(Aa_Company.getPrice());
        System.out.println(Aa_Company.getAveragePrice());

    }
}