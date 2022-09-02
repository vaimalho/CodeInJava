package multithreading;

public class ThreadYieldDemo {

    public static void main(String[] args) {
        MyThread9 t = new MyThread9();
        t.start();

        for(int i=0; i<10;i++){
            System.out.println("Main Thread!!!!");
        }
    }
}
