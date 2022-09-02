package multithreading;

public class DaemonThreadDemo {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().isDaemon()); // false

        //Thread.currentThread().setDaemon(true); // RTE: IllegalArgumentException

        Thread t = new Thread();
        System.out.println(t.isDaemon());

        t.setDaemon(true);

        System.out.println(t.isDaemon());
    }
}
