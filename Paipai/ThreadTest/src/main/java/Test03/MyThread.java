package Test03;

public class MyThread extends Thread {
    public void run(){
        int i;
        for(i=0;i<10;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("mythread->>"+i);
        }
    }
}
