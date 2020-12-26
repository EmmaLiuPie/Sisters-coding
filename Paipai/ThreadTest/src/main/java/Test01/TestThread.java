package Test01;

public class TestThread {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        //mythread.run();
        mythread.start();
        int i;
        for(i=0;i<10;i++){
            System.out.println("main thread->>"+i);
        }
    }
}
