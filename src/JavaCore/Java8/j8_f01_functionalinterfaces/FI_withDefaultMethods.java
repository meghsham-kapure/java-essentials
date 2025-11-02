package CoreJavaTopics.java8_features.jf01_functionalinterfaces;

interface FunctionalInterface2{
    default void defaultMethod1(){
        System.out.println("This is default method 1");
    }

    default void defaultMethod2(){
        System.out.println("This is default method 2");
    }
}

class ChildClass implements FunctionalInterface2{
    @Override
    public void defaultMethod2() {
        System.out.println("This is default method 2 but overridden");
    }
}

public class FI_withDefaultMethods {
    public static void main(String[] args) {
        ChildClass childObj = new ChildClass();
        childObj.defaultMethod1();
        childObj.defaultMethod2();
    }
}
