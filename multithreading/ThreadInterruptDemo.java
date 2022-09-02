package multithreading;

public class ThreadInterruptDemo {

    public static void main(String[] args) {

        MyThread14 t = new MyThread14();
        t.start();
        t.interrupt();

        System.out.println("Main Thread!!");
    }
}
