import java.util.Scanner;

public class EXAMEasterLunch01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int EasterBread = Integer.parseInt(scan.nextLine());
        int eggPackaging = Integer.parseInt(scan.nextLine());
        int cookies = Integer.parseInt(scan.nextLine());

        //•	Козунак  – 3.20 лв.
        //•	Яйца –  4.35 лв. за кора с 12 яйца
        //•	Курабии – 5.40 лв. за килограм
        //•	Боя за яйца - 0.15 лв. за яйце
                // calculate
        double sumEasterBreadPrice = EasterBread * 3.20;
        double sumEggsPackaging = eggPackaging * 4.35;
        double sumCookies = cookies * 5.40;
        double sumPaint = eggPackaging * 12 * 0.15;

        double TotalSum = sumEasterBreadPrice + sumEggsPackaging + sumCookies + sumPaint ;

        System.out.printf("%.2f", TotalSum);
    }
}
