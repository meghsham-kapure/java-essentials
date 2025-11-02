package DSA.JD08_Recursion;

public class PT01_BasicFunctionRecursion {
    static void main() {
        printMessages5Time(0);
    }


    public static void printMessages5Time (int counter){
        //Function body
        System.out.println("Good Morning Meghsham !!! "+(counter++));


        //base condition
        if (counter<5){
            printMessages5Time(counter);
        }else {
            return;
        }

    }
}
