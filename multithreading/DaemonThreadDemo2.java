package multithreading;

public class DaemonThreadDemo2 {

    public static void main(String[] args) {

        MyThread17 t = new MyThread17();
        t.setDaemon(true);
        t.start();

        System.out.println("Main Thread!!!!");


    }
}
