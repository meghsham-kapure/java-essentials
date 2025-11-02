package DSA.JD08_Recursion.ChaiAurCode.Recursion;

public class FactorialUsingRecursion {
    public static void main(String[] arg){
        System.out.println(factorialUsingRecursion(4));

    }

    public static int factorialUsingLoop(int num){
        if (num ==0) return 1;
        else{
            int factorial = 1 ;
            for (int i = 1; i <= num; i++)
                factorial *= i;
            return  factorial;
        }
    }

    public static int factorialUsingRecursion(int num) {
        if (num <= 1)
            return num;
        else
            return (num)* factorialUsingRecursion(num - 1) ;
    }
}
