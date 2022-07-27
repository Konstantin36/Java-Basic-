import java.util.Scanner;

public class EasterDecoration06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //•    кошничка за яйца (basket) – 1.50 лв.
        //•    великденски венец (wreath) – 3.80 лв.
        //•    шоколадов заек (chocolate bunny) – 7 лв.

        int customers = Integer.parseInt(scan.nextLine());
        String storePurchase = scan.nextLine();

        double basket = 0;
        double wreath = 0;
        double chocolateBunny = 7;
        double sum = 0;
        String stop = "";
        while (!stop.equals("Finish")){
            String purchase = "";
            if (storePurchase.equals("basket")){
                basket = 1.50;

            } else if (storePurchase.equals("wreath")) {
                wreath = 3.80 ;

            }

            sum = basket + wreath ;
                break;
        }
        System.out.println(sum);
    }
}

