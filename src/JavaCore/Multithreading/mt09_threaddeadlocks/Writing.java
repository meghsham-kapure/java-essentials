package CoreJavaTopics.java_multithreading.mt09_threaddeadlocks;

class Pen{
    public synchronized void writeWithPenAndPaper (Paper paper){
        System.out.println(Thread.currentThread().getName() +"\t"+ "using Pen"+(this.toString()) + " and trying to acquire paper" +paper.toString() );
        paper.finishWriting ();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " finish using paper " + this  );
    }
}

class Paper{
    public synchronized void writeWithPaperAndPen (Pen pen){
        System.out.println(Thread.currentThread().getName() +"\t"+ "using Paper"+(this.toString()) + " and trying to acquire pen" + pen.toString() );
        pen.finishWriting ();
    }

    public synchronized  void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " finish using Paper " + this  );
    }
}

class WritingThread_1 extends Thread {
    private Pen pen;
    private Paper paper;

    WritingThread_1(Pen pen, Paper paper){
        this.pen = pen;
        this.paper = paper;

    }

    @Override
    public void run (){
        synchronized (paper){
            pen.writeWithPenAndPaper(paper);
        }
    }
}

class WritingThread_2 extends Thread {
    private Pen pen;
    private Paper paper;

    WritingThread_2(Pen pen, Paper paper){
        this.pen = pen;
        this.paper = paper;
    }
    @Override
    public void run (){
        synchronized (pen) {
            paper.writeWithPaperAndPen(pen);
        }

    }
}


public class Writing{
    public static void main(String[] args) throws Exception {
        Pen pen = new Pen();
        Paper paper = new Paper();

        WritingThread_1 wt_1 = new WritingThread_1(pen, paper);
        WritingThread_2 wt_2 = new WritingThread_2(pen, paper);

        wt_1.start();
        wt_2.start();
    }
}
