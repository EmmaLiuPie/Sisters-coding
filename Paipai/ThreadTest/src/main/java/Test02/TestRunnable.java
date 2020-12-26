package Test02;

public class TestRunnable {
    public static void main(String[] args) {
        MyRunnable myrunnable = new MyRunnable();
        Thread t = new Thread(myrunnable);
        t.start();

        int i;
        for(i=0;i<10;i++){
            System.out.println("main thread->>"+i);

        }
    }
}
