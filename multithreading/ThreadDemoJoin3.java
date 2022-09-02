package multithreading;

public class ThreadDemoJoin3 {

    public static void main(String[] args) throws InterruptedException{

        MyThread11.mt = Thread.currentThread();

        MyThread11 t = new MyThread11();
        t.start();
        t.join();

        for(int i=0; i<10;i++){
            System.out.println("Main Thread!!!");
        }


    }
}
