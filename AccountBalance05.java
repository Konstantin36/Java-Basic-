package LAB;

import java.util.Scanner;

public class AccountBalance05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalMoney = 0;
        String input = scan.nextLine();
        while (!input.equals("NoMoreMoney")){

            double sum = Double.parseDouble(input);
            if (sum < 0){
                System.out.printf("Invalid operation!");
                break;
            }
            else {
                System.out.printf("Increase: %.2f%n", sum);
                totalMoney += sum;
            }

            input = scan.nextLine();
        }
        System.out.printf("Total: %.2f", totalMoney);
    }
}
