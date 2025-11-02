package DSA.JD02_ConditionalsAndLoops;

import java.util.Scanner;

public class PT03_ElseIfStatement {
    public static void main(String[] args) {
        System.out.println("Enter you marks : ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks < 60) {
            System.out.println("You cant get admission");
        } else if (marks < 80) {
            System.out.println("You can get admission in IT Department");
        } else if (marks < 100) {
            System.out.println("You can get admission in Computer Science Department");
        }
    }
}
