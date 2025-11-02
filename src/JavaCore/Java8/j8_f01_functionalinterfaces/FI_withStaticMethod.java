package CoreJavaTopics.java8_features.jf01_functionalinterfaces;
@FunctionalInterface
interface FunctionalInterface1 {
    void onlyMethod();

    static void staticMethod0(){
        System.out.println("I am static method 0 in interface");
    }

    static void staticMethod1(){
        System.out.println("I am static method 1 in interface");
    }

    static void staticMethod2(){
        System.out.println("I am static method 2 in interface");
    }
}


public class FI_withStaticMethod {

    public static void main(String[] args) {
        FunctionalInterface1.staticMethod0();
        FunctionalInterface1.staticMethod1();
        FunctionalInterface1.staticMethod2();
    }

}
