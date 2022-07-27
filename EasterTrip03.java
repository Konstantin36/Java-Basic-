import java.util.Scanner;

public class EasterTrip03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String destination = scan.nextLine();
        String date = scan.nextLine();
        int nightNum = Integer.parseInt(scan.nextLine());

        double price = 0;
        if (destination.equals("France")){
            if (date.equals("21-23")){
                price = 30.0;
            }
            if (date.equals("24-27")){
                price = 35.0;
            }
            if (date.equals("28-31")){
                price = 40.0;
            }
        } else if (destination.equals("Italy")){
            if (date.equals("21-23")){
                price = 28.0;
            }
            if (date.equals("24-27")){
                price = 32.0;
            }
            if (date.equals("28-31")){
                price = 39.0;
            }
        } else if (destination.equals("Germany")){
            if (date.equals("21-23")){
                price = 32.0;
            }
            if (date.equals("24-27")){
                price = 37.0;
            }
            if (date.equals("28-31")){
                price = 43.0;
            }
        }
        double totalSum = nightNum *  price;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, totalSum);
    }
}
