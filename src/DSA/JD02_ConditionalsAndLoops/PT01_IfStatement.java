package DSA.JD02_ConditionalsAndLoops;

import java.util.Scanner;

public class PT01_IfStatement {
    public static void main(String[] args) {


        System.out.println("Enter you salary : ");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();

        if (salary < 20000) {
            System.out.println("Get new Job");
        } else {
            System.out.println("Get some experience here, then jump");
        }
    }
}
