package DSA.JD03_Functions;

public class PQ02_ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(143));
        System.out.println(isArmstrong(153));
    }

    public static boolean isArmstrong(int number) {
        int numberCopy = number;
        int numberSum = 0;
        while (numberCopy > 0) {
            numberSum += cube(numberCopy % 10);
            numberCopy /= 10;
        }
        return number == numberSum;
    }

    public static int cube(int num) {
//        return num * num * num;
        return (int) Math.pow(num, 3);
    }
}
