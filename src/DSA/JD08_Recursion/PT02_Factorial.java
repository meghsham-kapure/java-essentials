package DSA.JD08_Recursion;

public class PT02_Factorial {
    static void main(String[] args){
        System.out.println(factorial(4));

    }

    public static int factorial (int n){
        //base_case
        if (n == 0){
            return  1;
        }

        //recursive_case
        else  {
            return  n * factorial(n-1);
        }
    }
}
