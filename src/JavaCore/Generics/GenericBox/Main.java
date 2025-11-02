package JavaCore.Generics.GenericBox;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Royal Enfield Continetal GT 650");
        System.out.println(stringBox.getValue());


        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(8055);
        System.out.println(integerBox.getValue());



    }
    
}
