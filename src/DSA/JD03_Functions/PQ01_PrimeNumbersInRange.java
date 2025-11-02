package DSA.JD03_Functions;

public class PQ01_PrimeNumbersInRange {
    public static void main(String[] args) {
        primeNumberInGiveRange(0, 100);

    }

    public static void primeNumberInGiveRange(int start, int end) {
        for (int i = start; i < end; i++) {
            if (isPrime(i)) {
                System.out.print(i + ",");
            }
        }
    }

    public static boolean isPrime(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
