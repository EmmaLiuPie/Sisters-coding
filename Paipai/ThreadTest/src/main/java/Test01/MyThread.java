package Test01;

public class MyThread extends Thread{
    @Override
    public void run(){
        int i;
        for(i=0;i<10;i++){
            System.out.println("mythread ->>"+i);
        }
    }
}
