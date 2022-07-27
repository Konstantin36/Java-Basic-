    import java.util.Scanner;

    public class EasterEggsBattle04 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int eggsFirstPlayer = Integer.parseInt(scan.nextLine());
            int eggsSecondPlayer = Integer.parseInt(scan.nextLine());
            String winner = scan.nextLine();

            while (!winner.equals("End")){
                if (winner.equals("one")){
                    eggsSecondPlayer--;
                } if (winner.equals("two")) {
                    eggsFirstPlayer --;
                }
                if (eggsFirstPlayer == 0){
                    System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsSecondPlayer);
                    break;
                } else if (eggsSecondPlayer == 0) {
                    System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsFirstPlayer);
                    break;
                }
                winner = scan.nextLine();
            }
            if (winner.equals("End")){
                System.out.printf("Player one has %d eggs left.\n", eggsFirstPlayer);
                System.out.printf("Player two has %d eggs left.", eggsSecondPlayer);
            }
        }
    }
