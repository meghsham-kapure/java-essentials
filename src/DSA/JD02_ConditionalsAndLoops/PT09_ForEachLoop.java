package DSA.JD02_ConditionalsAndLoops;

public class PT09_ForEachLoop {
    public static void main(String[] args) {
        int arr[] = randomValuedIntegerArrayGenerator(10);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] randomValuedIntegerArrayGenerator(int size) {
        int randomNumberArray[] = new int[size];

        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = (int) (1 + Math.random() * 100);
        }
        return randomNumberArray;
    }
}
