package multithreading;

public class ThreadDemo7 {

    public static void main(String[] args) {

        MyThread6 t = new MyThread6();
        t.start();
        t.start();

        System.out.println("Main Thread!!");

    }

}
