import java.util.Scanner;

public class EasterBakery02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double brashnoPriceKg = Double.parseDouble(scan.nextLine());
        double brashnoKilogrami = Double.parseDouble(scan.nextLine());
        double suitKilogrami = Double.parseDouble(scan.nextLine());
        int packegeEggs = Integer.parseInt(scan.nextLine());
        int maya = Integer.parseInt(scan.nextLine());
            // calculate
        double priceSuit = brashnoPriceKg * 0.75 ;
        double priceEggs = brashnoPriceKg * 1.1;
        double priceMaya =  priceSuit * 0.2 ;
        double sumBrashno = brashnoPriceKg * brashnoKilogrami ;
        double sumSuit = priceSuit * suitKilogrami ;
        double sumEggs = packegeEggs * priceEggs;
        double sumMaya = priceMaya * maya ;
        double totalSum = sumBrashno + sumEggs + sumMaya + sumSuit ;

        System.out.printf("%.2f", totalSum);
    }
}


