import java.util.Scanner;

public class PaintingEggs03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String size = scan.nextLine();
        String color = scan.nextLine(); // "Red", "Green" или "Yellow"
        int batches = Integer.parseInt(scan.nextLine());

        int priceBatches = 0;
        if (size.equals("Large")){
            if (color.equals("Red")){
                priceBatches = 16 ;
            }
            if (color.equals("Green")){
                priceBatches = 12 ;
            }
            if (color.equals("Yellow")){
                priceBatches = 9;
            }
        } else if (size.equals("Medium")) {
            if (color.equals("Red")){
                priceBatches = 13 ;
            }
            if (color.equals("Green")){
                priceBatches = 9 ;
            }
            if (color.equals("Yellow")){
                priceBatches = 7;
            }
        } else if (size.equals("Small")) {
            if (color.equals("Red")){
                priceBatches = 9 ;
            }
            if (color.equals("Green")){
                priceBatches = 8 ;
            }
            if (color.equals("Yellow")){
                priceBatches = 5;
            }
        }
        int sumPrice = batches * priceBatches;
        double spend = sumPrice * 0.35 ;
        double totalSum = sumPrice - spend ;

        System.out.printf("%.2f leva.", totalSum);
    }
}
