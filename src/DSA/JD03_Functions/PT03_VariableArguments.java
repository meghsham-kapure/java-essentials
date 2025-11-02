package DSA.JD03_Functions;

public class PT03_VariableArguments {

    /*
     * VarArgs (Variable Arguments ) are used to accept any number of input values and process them in function
     * */

    public static void main(String[] args) {
        System.out.println(addThemAll(3, 1, 23, 4, 56, 7, 8, 9, 9, 5, 4, 1, 23, 36, 5, 62, 2, 6, 3, 2));

        namedAddThemAll("meghsham", 1, 23, 4, 5, 6, 6);
    }

    public static int addThemAll(int... numbers) {
        int sum = 0;

        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    public static void namedAddThemAll(String myName, int... numbers) {
        int sum = 0;

        for (int i : numbers) {
            sum += i;
        }

        System.out.println("Hey Meghsham, your addition is  " + sum);
    }
}
