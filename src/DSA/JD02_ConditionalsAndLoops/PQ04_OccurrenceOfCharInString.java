package DSA.JD02_ConditionalsAndLoops;

import java.util.Scanner;

public class PQ04_OccurrenceOfCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String inputString = sc.nextLine();

        System.out.print("Enter a String : ");
        char inputSearchChar = sc.nextLine().toLowerCase().charAt(0);

        int occurrenceCounter = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.toLowerCase().charAt(i) == inputSearchChar) {
                occurrenceCounter++;
                System.out.println(inputSearchChar + " is Fount at index " + i);
            }
        }

        System.out.println("Total Occurrence of " + inputSearchChar + " in " + inputString + " is : " + occurrenceCounter);
    }
}
