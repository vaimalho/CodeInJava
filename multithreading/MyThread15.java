package multithreading;

public class MyThread15 extends Thread {

    DisplayDemo1 d;
    String name;

    MyThread15(DisplayDemo1 d, String name){
        this.d=d;
        this.name = name;
    }

    @Override
    public void run(){
        d.wish(name);
    }

}
