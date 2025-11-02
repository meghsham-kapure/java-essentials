package CoreJavaTopics.java8_features.jf02_lambdaexpressions.p01_usinglambdawithcustomfunctionalinterface;

 interface Computer{
    //Declaring abstract method
    public void work();
}


public class P01_UsingLambdaWithCustomFunctionalInterface {
    public static void main(String[] args) {
        //Definaing implementation of interface's abstract method using Lambda Function
        Computer comp = () -> {
            System.out.println("Directly implementing abstract method of functional interface without implementation class");
        };

        // calling lambda function created
        comp.work();
    }    
}
