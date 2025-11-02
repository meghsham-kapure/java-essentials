package DSA.JD03_Functions;

public class PT05_MethodOverriding {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println("Parent running the business");
        parent.runBusiness();

        System.out.println("\n");

        System.out.println("Child running the business");
        child.runBusiness();
    }
}


class Parent {
    public void runBusiness() {
        System.out.println("I have a shop and sell everything there only");
    }

}

class Child extends Parent {
    @Override
    public void runBusiness() {
        System.out.println("I'll have the shop and webside and sell everything on both");
    }

}