package CoreJavaTopics.java8_features.jf03_annonymouslambdafunctions;

interface Computer {
    public void work_1();

    public void work_2();
}

public class P02_ImpmentingAnnoymousClass {
    public static void main(String[] args) {

        Computer laptop = new Computer() {

            @Override
            public void work_1() {
                System.out.println(
                        "implementaing work_1");
            }

            
            @Override
            public void work_2() {
                System.out.println(
                        "implementaing work_2");
            }

        };

        laptop.work_1();
        
        laptop.work_2();
    }
}