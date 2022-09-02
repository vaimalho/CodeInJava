package multithreading;

public class ThreadEven extends Thread {

    PrintNaturalNumbers mt;
    int N;

    ThreadEven(PrintNaturalNumbers mt, int N){
        this.mt = mt;
        this.N = N;
    }

    public void run(){

        synchronized (mt){
            for(int i=1; i<=N; i++){
                if(i%2!=0) {
                    try {
                        mt.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else{
                    System.out.println(i);
                }
                mt.notify();
            }
        }
    }


}
