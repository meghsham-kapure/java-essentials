package DSA.JD02_ConditionalsAndLoops;

import java.util.Scanner;

public class PQ01_LargestNumber {
    public static void main(String[] args) {

        System.out.println("Enter 3 numbers : ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int number1 = sc.nextInt();

        System.out.print("Enter number 2 : ");
        int number2 = sc.nextInt();

        System.out.print("Enter number 3 : ");
        int number3 = sc.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("Number 1 " + number1 + " is largest");

        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Number 2 " + number2 + " is largest");

        } else if (number3 > number1 && number3 > number2) {
            System.out.println("Number 3 " + number3 + " is largest");

        }
    }
}
