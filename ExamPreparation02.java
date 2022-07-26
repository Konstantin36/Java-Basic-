package EXERSICE;

import java.util.Scanner;

public class ExamPreparation02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int failedThreshold = Integer.parseInt(scan.nextLine());

        int failedTimes = 0;
        int solvedProblemsCount = 0;
        double gradeSum = 0;
        String lastProlem = "";
        boolean isFailed = true;

        while (failedTimes < failedThreshold){
            String problemName = scan.nextLine();
            if ("Enough".equals(problemName)){
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scan.nextLine());
            if (grade <= 4) {
                failedTimes ++;
            }
            gradeSum += grade ;
            solvedProblemsCount ++;
            lastProlem = problemName ;
        }
        if (isFailed){
            System.out.printf("You need a break, %d poor grades", failedThreshold);
        }else {
            System.out.printf("Average score: %.2f%n", gradeSum / solvedProblemsCount );
            System.out.printf("Number of problems: %d%n", solvedProblemsCount);
            System.out.printf("Last problem: %s", lastProlem);
        }
    }
}
