package JavaCore.Multithreading.mt08_threadcommunications;

    public class ProducerThread extends Thread {
        private final SharedResourceX1 sharedResourceX1;

        public ProducerThread(SharedResourceX1 sharedResourceX1) {
            this.sharedResourceX1 = sharedResourceX1;
            System.out.println(sharedResourceX1);
        }

        @Override
        public void run() {
            System.out.println("Producer Thread "+Thread.currentThread().getName()+" started running");

            while(true) {
                sharedResourceX1.produce((int) (Math.random() * 100));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            //System.out.println("Consumer Thread " +Thread.currentThread().getName()+ " stopped running");
        };
    }
