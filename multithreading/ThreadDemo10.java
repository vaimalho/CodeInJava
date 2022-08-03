package multithreading;

public class ThreadDemo10 {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getPriority());

        Thread t = new Thread();
        System.out.println(t.getPriority());

        // RTE: Valid Range: 1 - 10
        //Thread.currentThread().setPriority(15);

        Thread.currentThread().setPriority(9);

        Thread t1 = new Thread();
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(t1.getPriority());
    }

}
