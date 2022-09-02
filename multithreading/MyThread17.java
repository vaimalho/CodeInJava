package multithreading;

public class MyThread17 extends Thread {

    public void run(){

        for(int i=0; i<10; i++){

            try {
                System.out.println("CHild Thread!!!!!");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
