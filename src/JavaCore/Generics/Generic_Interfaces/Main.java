package JavaCore.Generics.Generic_Interfaces;

public class Main {
    public static void main(String[] args) {
        // Working with StringContainer
        StringContainer stringContainer = new StringContainer();
        stringContainer.set("Megsham Kapure");
        System.out.println(stringContainer.get());

        // Working with IntegerContainer
        IntegerContainer integerContainer = new IntegerContainer();
        integerContainer.set(9101996);
        System.out.println(integerContainer.get());
    }
}