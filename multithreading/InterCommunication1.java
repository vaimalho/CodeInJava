package multithreading;

public class InterCommunication1 {

    public static void main(String[] args) {

        MyThread16 t = new MyThread16();
        t.start();

        synchronized (t){
            try{
                t.wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println(t.total);
    }
}
