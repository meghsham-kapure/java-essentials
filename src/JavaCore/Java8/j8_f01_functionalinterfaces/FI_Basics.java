package CoreJavaTopics.java8_features.jf01_functionalinterfaces;

//functional interface has only one instance method
@FunctionalInterface
interface FunctionalInterface0{
    void onlyMethod();
}

// as interface's instance method is abstract, we have first overridden it
class ChildClass1 implements FunctionalInterface0{
    @Override
    public void onlyMethod() {
        System.out.println("This is a method of a functional interface which overridden in the child class");
    }
}

public class FI_Basics {
    public static void main(String[] args) {
        ChildClass1 childObj = new ChildClass1();
        childObj.onlyMethod();
    }
}
