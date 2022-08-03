package multithreading;

public class ThreadDemo2 {

    public static void main(String[] args) {

        MyThread2 t = new MyThread2();
        t.run();

        for(int i=0; i<10; i++){
            System.out.println("Main Thread!!!");
        }
    }

}
