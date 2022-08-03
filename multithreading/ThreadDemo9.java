package multithreading;

public class ThreadDemo9 {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        Thread t = new Thread();
        System.out.println(t.getName());

        Thread t1 = new Thread();
        System.out.println(t1.getName());

        Thread.currentThread().setName("Vaibhav");
        System.out.println(Thread.currentThread().getName());

        System.out.println(10/0);


    }

}
