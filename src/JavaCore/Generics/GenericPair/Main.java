package JavaCore.Generics.GenericPair;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<String,Integer>("Meghsham", 9101996);
        System.out.println(pair1);

        pair1.setKey("Meghsham Kapure");
        pair1.setValue(76);

        System.out.println(pair1.getKey());
        System.out.println(pair1.getValue());

    }
}
