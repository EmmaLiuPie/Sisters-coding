package Test02;

public class MyRunnable implements Runnable{


    public boolean run=true;

    public void run(){
        int i;
        if(run) {
            for (i = 0; i < 10; i++) {
                System.out.println("myrunnable->>" + i);
            }
        }
        else
            return;
    }
}
