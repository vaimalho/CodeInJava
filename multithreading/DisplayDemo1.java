package multithreading;

public class DisplayDemo1 {

    synchronized public void wish(String name){
        for(int i=0;i<10;i++){
            System.out.println("Good Morning:: ");

            try {
                Thread.sleep(1000);
                System.out.println(name);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
