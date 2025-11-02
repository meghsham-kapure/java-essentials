package DSA.JD02_ConditionalsAndLoops;

import java.util.Scanner;

public class PT05_WhileLoop {
    public static void main(String[] args) {
        System.out.println("Enter you counter : ");
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();

        while (counter > 0) {
            System.out.println("Current counter is " + counter--);
        }
    }
}
