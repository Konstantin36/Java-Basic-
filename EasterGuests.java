import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int guests = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double easterBread = Math.ceil(guests / 3.0);
        int countEggs = guests * 2 ;
        double priceEasterBread = easterBread * 4 ;
        double priceEggs = countEggs * 0.45 ;
        double sum = priceEasterBread + priceEggs ;

        if (sum < budget){
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.\n", easterBread, countEggs);
            System.out.printf("He has %.2f lv. left.",Math.abs (budget - sum));
        }else {
            System.out.printf("Lyubo doesn't have enough money.\n");
            System.out.printf("He needs %.2f lv. more.", Math.abs (sum - budget));
        }

    }
}
