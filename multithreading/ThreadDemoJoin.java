package multithreading;

public class ThreadDemoJoin {

    public static void main(String[] args) throws InterruptedException{

        MyThread10 t = new MyThread10();
        t.start();
        t.join();

        for(int i=-0;i<10;i++){
            System.out.println("Main Thread!!");
        }
    }
}
