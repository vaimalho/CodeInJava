package multithreading;

public class ThreadDemo6 {

    public static void main(String[] args) {

        MyThread6 t = new MyThread6();
        t.start();

        System.out.println("Main Thread!!");

    }

}
