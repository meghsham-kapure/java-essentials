package DSA.JD02_ConditionalsAndLoops;

import java.util.Scanner;

public class PQ03_FibonacciSeries {
    public static void main(String[] args) {
        int firstNum = 0;
        int secondNum = 1;
        int printNum = 0;
        System.out.print("Enter limit number : ");
        Scanner sc = new Scanner(System.in);
        int limitNumber = sc.nextInt();

        System.out.print(firstNum + "," + secondNum + ",");
        while (printNum <= limitNumber) {
            printNum = firstNum + secondNum;
            if (printNum <= limitNumber)
                System.out.print(printNum + ",");
            firstNum = secondNum;
            secondNum = printNum;
        }
    }
}
