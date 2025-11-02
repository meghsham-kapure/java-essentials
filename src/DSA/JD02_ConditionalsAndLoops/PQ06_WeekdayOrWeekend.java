package DSA.JD02_ConditionalsAndLoops;

import java.util.Scanner;

public class PQ06_WeekdayOrWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Day Number  : ");
        int dayNumber = sc.nextInt();


        switch (dayNumber) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday you have to work bro!!");
            case 6, 7 ->
                    System.out.println("If you have to get ahead of them then work or waste you time again, choice is yours...");
            default -> System.out.println("Are you in in some other universe.");
        }
    }
}
