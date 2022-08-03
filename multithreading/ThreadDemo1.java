package multithreading;

public class ThreadDemo1 {

    public static void main(String[] args) {

        MyThread1 t = new MyThread1();
        t.start();

        for(int i=0; i<10; i++){
            System.out.println("Main Thread!!!");
        }
    }

}
