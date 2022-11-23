package arrays;

public class EvenOddThread {

    int count = 1;

    static int N;

    public void printOddNumbers(){
        synchronized (this) {
            while (count < N) {
                while (count % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                }

                System.out.print(count + " ");
                count++;

                notify();
            }
        }
    }

    public void printEvenNumbers(){
        synchronized (this) {
            while (count < N) {
                while (count % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                }

                System.out.print(count + " ");
                count++;

                notify();
            }
        }
    }

    public static void main(String[] args) {
        N = 100;

        EvenOddThread obj = new EvenOddThread();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.printEvenNumbers();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.printOddNumbers();
            }
        });

        t1.start();
        t2.start();

    }

}
