package multithreading;

public class ThreadDemo8 {

    public static void main(String[] args) {

        MyThread8 r = new MyThread8();
        Thread t = new Thread(r);
        t.start();

        for(int i=0; i<10; i++) {
            System.out.println("MainThread!!");
        }
    }

}
