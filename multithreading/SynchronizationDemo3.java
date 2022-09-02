package multithreading;

public class SynchronizationDemo3 {

    public static void main(String[] args) {

        DisplayDemo2 d = new DisplayDemo2();

        MyThreadN t1 = new MyThreadN(d);
        MyThreadC t2 = new MyThreadC(d);

        t1.start();
        t2.start();
    }
}
