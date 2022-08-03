package multithreading;

public class MyThread6 extends Thread{

    public void start(){
        super.start();
        System.out.println("Start Method!!");
    }

    public void run(){
        System.out.println("RUn Method!!");
    }

}
