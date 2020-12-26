package Test03;

public class TestThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println(myThread.getName());
        myThread.setName("t-name");
        System.out.println(myThread.getName());
        myThread.start();
        Thread myThread1=Thread.currentThread();
        System.out.println(myThread);
        int i;
        for(i=0;i<10;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            }
            System.out.println("main->>"+i);
        }


    }

