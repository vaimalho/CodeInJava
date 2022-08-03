package multithreading;

public class MyThread3 extends Thread{

    public void run(){
            System.out.println("run() with no Args!!");
    }

    public void run(int n){
        System.out.println("run() with ARgs!!");
    }
}
