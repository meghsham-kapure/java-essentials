package CoreJavaTopics.java8_features.jf01_functionalinterfaces.P02_ExplicitFunctionalInterface.java;

@FunctionalInterface
interface Computer{
    public void work();

    // @FunctionalInterface restricts us to add or remove any number of instance method to and from Functional Interface, doing that will cause errors
}

class ChildOfComputer implements Computer{
    @Override
    public void work(){
        System.out.println("This is a single abstract method in a Explicitly Annoteted Funcational Interface !!!");
    }
}

public class P02_ExplicitFunctionalInterface {
    public static void main(String[] args) {
        
        ChildOfComputer laptop = new ChildOfComputer();
        laptop.work();
    }
}