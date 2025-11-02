package JavaCore.Multithreading.mt04_threadlambdaexpression;
public class ThreadLambdaExpression {
    public static void main(String[] args)  {

        Thread thread_1 = new Thread (
            () ->{
            for (int i = 0; i < 10; i++) {
                System.out.print("Hello ");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        Thread thread_2 = new Thread (
                () ->{
                        for (int i = 0; i < 10; i++) {
                            System.out.print("Hi ");
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                     }
                 );

        thread_1.start();
        thread_2.start();
    }
}
