package LLD_7.mixed_call_run;

public class FixedThreadPool implements Runnable {
    int number;
    FixedThreadPool(int number){
        this.number = number;
    }
    @Override
    public void run(){
        System.out.println("Thread: "+Thread.currentThread().getName()+" Number"+number);
    }
}
