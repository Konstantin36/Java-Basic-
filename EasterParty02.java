import java.util.Scanner;

public class EasterParty02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int guests = Integer.parseInt(scan.nextLine());
        double priseReserve = Double.parseDouble(scan.nextLine());
        double moneyDesy =Double.parseDouble(scan.nextLine());

        double reserveTotal = 0;
        double priceCake = moneyDesy * 0.10 ;
        double budget = 0;
        double diff = 0 ;

        if (guests >= 10 && guests <= 15){
            reserveTotal = priseReserve - (priseReserve * 15 / 100);
             budget = (guests * reserveTotal) + priceCake;
             diff = Math.abs (moneyDesy - budget);

        } else if (guests > 15 && guests < 20) {
            reserveTotal = priseReserve - (priseReserve * 1 / 5);
            budget = (guests * reserveTotal) + priceCake;
            diff = Math.abs (moneyDesy - budget);

        } else if (guests > 20) {
            reserveTotal = priseReserve - (priseReserve / 4) ;
            budget = (guests * reserveTotal) + priceCake;
            diff = Math.abs (moneyDesy - budget);


        }else if (guests < 10){
            reserveTotal = priseReserve ;
            budget = (guests * reserveTotal) + priceCake;
            diff = Math.abs (moneyDesy - budget);
        }
        if (moneyDesy >= budget){
            System.out.printf("It is party time! %.2f leva left.", diff);
        }else {
            System.out.printf("No party! %.2f leva needed.", diff);
        }
    }
}
