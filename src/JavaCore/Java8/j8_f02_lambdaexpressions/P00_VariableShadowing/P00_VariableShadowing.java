package CoreJavaTopics.java8_features.jf02_lambdaexpressions.p00_variableshadowing;

@FunctionalInterface
interface FunctionalInterfaceExample {
    void justALoop();
}

class WithoutLambda implements FunctionalInterfaceExample {
    int a = 100;

    @Override
    public void justALoop() {
        // Local variable 'a' shadows the class field 'a'
        for (int a = 0; a < 3; a++) {
            System.out.println("Loop (Without Lambda): " + a);
        }
    }

    public int getA() {
        return a;
    }
}



class WithLambda implements FunctionalInterfaceExample {
    int a = 200;

    // This will cause a compile-time error due to variable shadowing
    FunctionalInterfaceExample lambdaLoop = () -> {
        // int a = 0; // ❌ Error: 'a' is already defined in the scope (as a local var in enclosing method or lambda)
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop (With Lambda): " + i);
        }
    };

    @Override
    public void justALoop() {
        lambdaLoop.justALoop();
    }

    public int getA() {
        return a;
    }
}
