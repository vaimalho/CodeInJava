package multithreading;

public class DisplayDemo2 {

    public synchronized void displayN(){
        for(int i=0; i<10;i++){
            System.out.print(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void displayC(){
        for(int i=65;i<75;i++){
            System.out.print((char)i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static synchronized public void wish(String name){
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
