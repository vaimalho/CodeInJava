package multithreading;

public class ThreadDemo5 {

    public static void main(String[] args) {

        MyThread5 t = new MyThread5();
        t.start();

        System.out.println("Main Thread!!");

    }

}
