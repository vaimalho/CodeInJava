package multithreading;

public class MyThread9 extends Thread {

    @Override
    public void run() {

        for(int i=0; i<10; i++){
            System.out.println("Child Thread!!");
            Thread.yield();
        }

    }
}
