package DSA.JD02_ConditionalsAndLoops;

import java.util.Scanner;

public class PT02_IfElseStatement {
    public static void main(String[] args) {

        System.out.println("Enter you age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible for voting.");
        } else {
            System.out.println("Ineligible for voting.");

        }

    }
}
