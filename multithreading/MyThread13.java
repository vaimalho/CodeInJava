package multithreading;

public class MyThread13 extends Thread {

    @Override
    public void run(){

        for(int i=0; i<10;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Child Thread!!");
        }
    }
}
