package CoreJavaTopics.java8_features.jf01_functionalinterfaces.P01_ImplicitFunctionalInterface;

interface Computer{
    public void work();
    //we can add more instance method and use it, but doing that it will loose its right to be called as Functional Interdace
}

class ChildOfComputer implements Computer{
    @Override
    public void work(){
        System.out.println("This is a single abstract method in a Implicitly Funcational Interface !!!");
    }
}

public class P01_ImplicitFunctionalInterface {
    public static void main(String[] args) {
        
        ChildOfComputer laptop = new ChildOfComputer();
        laptop.work();
    }
    
}