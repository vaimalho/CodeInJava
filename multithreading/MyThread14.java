package multithreading;

public class MyThread14 extends Thread {

    @Override
    public void run(){

        for(int i=0; i<10;i++){
            try {
                System.out.println("Child Thread!!");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Got Interrupted!!");
            }
        }
    }
}
