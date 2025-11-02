package DSA.JD02_ConditionalsAndLoops;

import java.util.Scanner;

public class PQ05_ReversNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number to be reversed : ");
        int inputNum = sc.nextInt();

        int reversedNum = 0;
        int copyNum = inputNum;
        while (copyNum > 0) {
            reversedNum *= 10;
            reversedNum += copyNum % 10;

            copyNum /= 10;
        }

        System.out.println("Reversed Number of " + inputNum + " is " + reversedNum);
    }
}
