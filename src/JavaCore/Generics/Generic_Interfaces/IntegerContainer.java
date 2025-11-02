package JavaCore.Generics.Generic_Interfaces;

public class IntegerContainer implements Container<Integer> {
    private Integer value;

    @Override
    public void set(Integer value) {
        this.value = value;
    }

    @Override
    public Integer get() {
        return value;
    }
}
