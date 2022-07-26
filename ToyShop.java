import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceTrip = Double.parseDouble(scan.nextLine());
        int puzzle = Integer.parseInt(scan.nextLine());
        int talkingDolls = Integer.parseInt(scan.nextLine());
        int teddyBears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        double puzzlePrice = 2.60;
        int dollPrice = 3;
        double teddyBearPrice = 4.10;
        double minionsPrice = 8.20;
        int truckPrice = 2;

        double sum =
                puzzlePrice * puzzle + talkingDolls * dollPrice + teddyBearPrice * teddyBears + minions * minionsPrice + truckPrice * trucks;
        int toys = puzzle + teddyBears + minions + talkingDolls + trucks;

        if (toys >= 50){
            double discount = sum * 0.25;

            sum = sum - discount;
        }

        double rent = sum * 0.1;
        double priceAfterRent = sum - rent;


        if (priceAfterRent >= priceTrip){
            double totalPrice = priceAfterRent -priceTrip;
            System.out.print("Yes! ");
            System.out.printf("%.2f", totalPrice);
            System.out.print( " lv left.");
        }
        else if (priceAfterRent < priceTrip){
            double totalPrice = priceTrip - priceAfterRent;
            System.out.print("Not enough money! ");
            System.out.printf("%.2f",totalPrice);
            System.out.print(" lv needed.");
        }
    }

}