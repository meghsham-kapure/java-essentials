package CoreJavaTopics.java8_features.jf02_lambdaexpressions.p02_usinglambdawithbuiltinfunctionalinterface;

public class P02_UsingLambdaWithRunnabeleInterface {
    public static void main(String[] args) {
        
        Runnable runnableImplementation_1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runnable Implementation_1 Count @@ " + i);
            }
        }; 
        
        Runnable runnableImplementation_2 = () -> {
            for (int i = 10 ; i < 20; i++) {
                System.out.println("Runnable Implementation_2 Count ## " + i);
            }
        }; 

        Thread thread_1 = new Thread(runnableImplementation_1);
        
     

        Thread thread_2 = new Thread(runnableImplementation_2);

        thread_1.run();

                thread_2.run();


    }
}