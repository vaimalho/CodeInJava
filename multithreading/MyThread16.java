package multithreading;

public class MyThread16 extends Thread {

    int total=0;

    public void run(){

        for(int i=1;i<=100;i++){
            total+=i;
        }

        synchronized (this){
            this.notify();
        }
    }
}
