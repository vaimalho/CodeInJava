package multithreading;

public class SynchronizationDemo2 {

    public static void main(String[] args) {

        DisplayDemo1 d = new DisplayDemo1();
        DisplayDemo1 d1 = new DisplayDemo1();

        MyThread15 t = new MyThread15(d, "Dhoni");
        MyThread15 t1 = new MyThread15(d1, "Kohli");

        t.start();
        t1.start();
    }
}
