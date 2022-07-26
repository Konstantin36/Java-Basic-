package LAB;

import java.util.Scanner;

public class Password02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        String pass = scan.nextLine();

        String input = scan.nextLine();
        while (!input.equals(pass)){
            input = scan .nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}
