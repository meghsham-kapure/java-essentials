package DSA.JD08_Recursion;

public class PT01_FibonacciNumber {
    public static void main(String[] args){
        int position = 4;
        int fiboNum = fibo (position);
        System.out.println(fiboNum);
        System.out.println("The Fibonacci Number at "+position+"th position is "+fiboNum);
    }

    public static int fibo(int n){
        // Kunal's approch on this is based on fibo (n) = fibo (n-1) + fibo (n-2 )

        // base condition
        if (n < 2)
            return n;
        else
            return fibo(n-1) + fibo(n-2);//recursive_case
    }

    public static int fibonacciNum(int position){
        if (position ==0) return 0;
        else if (position ==1) return 1;
        else return calculateFibonacciNum(0 , 1 , position);
    }

    public static int calculateFibonacciNum (int n1, int n2, int position){
        if (position >= 2 )
            return calculateFibonacciNum(n2, n1+n2, --position);

        return n2;
    }
}
