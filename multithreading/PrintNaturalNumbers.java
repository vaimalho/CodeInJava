package multithreading;

public class PrintNaturalNumbers {

    static int N=10;
    public static void main(String[] args) {

        PrintNaturalNumbers mt = new PrintNaturalNumbers();

        ThreadEven t = new ThreadEven(mt,N);
        ThreadOdd t1 = new ThreadOdd(mt,N);

        t.start();
        t1.start();
    }
}
