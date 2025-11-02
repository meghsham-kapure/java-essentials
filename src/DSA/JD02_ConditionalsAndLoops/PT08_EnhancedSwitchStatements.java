package DSA.JD02_ConditionalsAndLoops;

import java.util.Scanner;

public class PT08_EnhancedSwitchStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Operand1  : ");
        int operand1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter a operator  : ");
        char operator = sc.nextLine().charAt(0);

        System.out.print("Enter a Operand 2 : ");
        int operand2 = sc.nextInt();

        switch (operator) {
            case '+' ->
                    System.out.println("Addition of " + operand1 + " and " + operand2 + " is " + (operand1 + operand2));
            case '-' ->
                    System.out.println("Substraction of " + operand1 + " and " + operand2 + " is " + (operand1 - operand2));
            case '*' ->
                    System.out.println("Multiplication of " + operand1 + " and " + operand2 + " is " + (operand1 * operand2));
            case '/' ->
                    System.out.println("Division of " + operand1 + " and " + operand2 + " is " + (operand1 / operand2));
            case '%' ->
                    System.out.println("Modulus of " + operand1 + " and " + operand2 + " is " + (operand1 % operand2));
            default -> System.out.println("Wrong operator is selected");
        }
    }
}
