package DSA.JD02_ConditionalsAndLoops;

import java.util.Scanner;

public class PT06_DoWhile {
    public static void main(String[] args) {
        System.out.println("Enter you counter : ");
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();

        do {
            System.out.println("Current counter is " + counter--);
        }
        while (counter > 0);
    }
}
