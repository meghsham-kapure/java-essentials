package DSA.JD02_ConditionalsAndLoops;

import java.util.Scanner;

public class PQ02_IsLoweOrUpperCase {
    public static void main(String[] args) {
        System.out.print("Enter a character : ");
        Scanner sc = new Scanner(System.in);
        char inputChar = sc.nextLine().charAt(0);

        if (inputChar >= 'A' && inputChar <= 'Z') {
            System.out.println("Input Character " + inputChar + " is in Upper Case");
        } else if (inputChar >= 'a' && inputChar <= 'z') {
            System.out.println("Input Character " + inputChar + " is in Lower Case");
        } else {
            System.out.println("Input Character is not a character");
        }

    }
}
